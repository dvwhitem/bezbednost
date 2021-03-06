package com.megatravel.authservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatravel.authservice.dao.UserDAO;
import com.megatravel.authservice.model.LoginUser;
import com.megatravel.authservice.model.Rola;
import com.megatravel.authservice.model.User;
import com.megatravel.authservice.model.users.Admin;
import com.megatravel.authservice.model.users.Agent;
import com.megatravel.authservice.model.users.Korisnik;
import com.megatravel.authservice.repository.AdminRepository;
import com.megatravel.authservice.repository.AgentRepository;
import com.megatravel.authservice.repository.KorisnikRepository;
import com.megatravel.authservice.repository.RevokedTokensRepository;
import com.megatravel.authservice.repository.RolaRepository;
import com.megatravel.authservice.security.JwtTokenUtil;
import com.megatravel.authservice.validators.LoginUserValidator;
import com.megatravel.authservice.validators.Valid;

@RestController
@CrossOrigin(origins = "https://localhost:3000")
@RequestMapping("/auth/login")
public class LoginController {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;
    
	@Autowired
    private AdminRepository adminRepository;
	
	@Autowired
    private AgentRepository agentRepository;
	
	@Autowired
    private KorisnikRepository korisnikRepository;
	
	@Autowired
	private RevokedTokensRepository revokedTokensRepository;
	
	@Autowired
	private RolaRepository rolaRepository;
	
	Logger log = LogManager.getLogger(LoginController.class);
    
	@PostMapping("/admin")
    public ResponseEntity<String> loginAdmin(@RequestBody LoginUser loginUser, HttpServletRequest req) throws Exception{
    	System.out.println("neki dobar token za admina");

    	Valid v = new LoginUserValidator().validate(loginUser);
		if (!v.isValid()) {
			
			if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
			
			return new ResponseEntity<>(v.getErrCode(),HttpStatus.UNPROCESSABLE_ENTITY);
		}
    	
		final Admin user = adminRepository.findByEmail(loginUser.getEmail());
		boolean result = passwordEncoder.matches(loginUser.getLozinka(), user.getLozinka());
        if (!result) {
        	
        	if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        	
        	return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        
        Rola rola = rolaRepository.findByNazivRole("ROLE_ADMIN");
        final String token = jwtTokenUtil.doGenerateToken(new User(user, rola));
        
        if(req.getHeader("X-FORWARDED-FOR")==null)
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
		else
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAdmin", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        
        return ResponseEntity.ok(token);
    }
	
	@PostMapping("/agent")
    public ResponseEntity<String> loginAgent(@RequestBody LoginUser loginUser, HttpServletRequest req) throws Exception{
    	System.out.println("neki dobar token za agenta");

    	Valid v = new LoginUserValidator().validate(loginUser);
		if (!v.isValid()) {
			
			if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
			
			return new ResponseEntity<>(v.getErrCode(),HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		final Agent user = agentRepository.findByEmail(loginUser.getEmail());
		boolean result = passwordEncoder.matches(loginUser.getLozinka(), user.getLozinka());
        if (!result) {
        	
        	if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        	
        	return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        
        Rola rola = rolaRepository.findByNazivRole("ROLE_AGENT");
        final String token = jwtTokenUtil.doGenerateToken(new User(user, rola));
        
        if(req.getHeader("X-FORWARDED-FOR")==null)
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
		else
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginAgent", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        
        return ResponseEntity.ok(token);
    }
	
	@PostMapping("/korisnik")
    public ResponseEntity<String> loginKorisnik(@RequestBody LoginUser loginUser, HttpServletRequest req) throws Exception{
    	System.out.println("neki dobar token za korisnika");

    	Valid v = new LoginUserValidator().validate(loginUser);
		if (!v.isValid()) {
			
			if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
			
			return new ResponseEntity<>(v.getErrCode(),HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		final Korisnik user = korisnikRepository.findByEmail(loginUser.getEmail());
		boolean result = passwordEncoder.matches(loginUser.getLozinka(), user.getLozinka());
        if (!result) {
        	if(req.getHeader("X-FORWARDED-FOR")==null)
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
			else
				log.error("Failed - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        	
        	return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        
        Rola rola = rolaRepository.findByNazivRole("ROLE_KORISNIK");
        final String token = jwtTokenUtil.doGenerateToken(new User(user, rola));
        
        if(req.getHeader("X-FORWARDED-FOR")==null)
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getRemoteAddr(), req.getMethod(), loginUser.getEmail());
		else
			log.info("Success - ProcessID: {} - IPAddress: {} - Type: {} - Email: {}", "loginKorisnik", req.getHeader("X-FORWARDED-FOR"), req.getMethod(), loginUser.getEmail());
        
        return ResponseEntity.ok(token);
    }
	
	@PostMapping("/role")
	public ResponseEntity<UserDAO> roleKorisnika(@RequestBody String token, HttpServletRequest req){
		String rola = "";
		String lozinka = "";
		
		if (revokedTokensRepository.findOne(token)!=null) {
			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
		}
		
		String email = jwtTokenUtil.getUsernameFromToken(token);
		if (email.isEmpty() || email.equals("")) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		if (korisnikRepository.findByEmail(email)!=null) {
        	rola = "ROLE_KORISNIK";
        	lozinka = korisnikRepository.findByEmail(email).getLozinka();
        } else if (agentRepository.findByEmail(email)!=null) {
        	rola = "ROLE_AGENT";
        	lozinka = agentRepository.findByEmail(email).getLozinka();
        } else if (adminRepository.findByEmail(email)!=null) {
        	rola = "ROLE_ADMIN";
        	lozinka = adminRepository.findByEmail(email).getLozinka();
        } else {
        	return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
		
		 if(req.getHeader("X-FORWARDED-FOR")==null)
				log.info("Success - ProcessID: {} - IPAddress: {} - Type: {}", "roleKorisnika", req.getRemoteAddr(), req.getMethod());
			else
				log.info("Success - ProcessID: {} - IPAddress: {} - Type: {}", "roleKorisnika", req.getHeader("X-FORWARDED-FOR"), req.getMethod());
	        
		
		return new ResponseEntity<UserDAO>(new UserDAO(email, lozinka, rola), HttpStatus.OK);
	}
    
    @GetMapping("/ping")
    private ResponseEntity<String> ping() {
		return new ResponseEntity<String>("You reached auth service: ping", HttpStatus.OK);
	}
    
}
