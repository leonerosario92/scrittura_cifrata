package com.cgmconsulting.jsonserver.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgmconsulting.jsonserver.exception.ResourceNotFoundException;
import com.cgmconsulting.jsonserver.model.Concorso;
import com.cgmconsulting.jsonserver.payload.request.ConcorsoRequest;
import com.cgmconsulting.jsonserver.repository.ConcorsoRepository;
import com.cgmconsulting.jsonserver.utils.EncryptionUtils;

@RestController
@RequestMapping(value="/api")
public class ConcorsoController {
	
	@Autowired
	private ConcorsoRepository concorsoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@GetMapping("concorso/{idConcorso}")
	public Concorso getConcorsoById(@PathVariable(value = "idConcorso") Long idConcorso) {
		Concorso concorso = concorsoRepository.findById(idConcorso)
			.orElseThrow(() -> new ResourceNotFoundException("concorso", "id", idConcorso));
		return concorso;
	}
	
	@PutMapping("concorso/insert")
	public Concorso insert() {
		
		Concorso concorso = initializeRequest();
		String playerEmail = concorso.getPlayerEmail();
		System.out.println("Player email : " +playerEmail);
		
		concorsoRepository.save(concorso);
		return getConcorsoById(concorso.getId());
	}

	private Concorso initializeRequest() {
		Concorso concorso = new Concorso();
		concorso.setBest_player_1_poitns(0);
		concorso.setBest_player_2_poitns(0);
		concorso.setBonusBench1(0);
		concorso.setBonusBench2(0);
		concorso.setBonusBench3(0);
		concorso.setBonusBench4(0);
		concorso.setBonusBench5(0);
		concorso.setBonusBench6(0);
		concorso.setBonusBench7(0);
		concorso.setMalusLineup1(0);
		concorso.setMalusLineup2(0);
		concorso.setMalusLineup3(0);
		concorso.setMalusLineup4(0);
		concorso.setMalusLineup5(0);
		concorso.setMalusLineup6(0);
		concorso.setMalusLineup7(0);
		concorso.setMalusLineup8(0);
		concorso.setMalusLineup9(0);
		concorso.setMalusLineup10(0);
		concorso.setMalusLineup11(0);
		concorso.setBonusLineup1(0);
		concorso.setBonusLineup2(0);
		concorso.setBonusLineup3(0);
		concorso.setBonusLineup4(0);
		concorso.setBonusLineup5(0);
		concorso.setBonusLineup6(0);
		concorso.setBonusLineup7(0);
		concorso.setBonusLineup8(0);
		concorso.setBonusLineup9(0);
		concorso.setBonusLineup10(0);
		concorso.setBonusLineup11(0);
		concorso.setPlayerEmail("leonerosario@email.com");
		concorso.setPlayerName("leonerosario");
		concorso.setPointsBench1(0);
		concorso.setPointsBench2(0);
		concorso.setPointsBench3(0);
		concorso.setPointsBench4(0);
		concorso.setPointsBench5(0);
		concorso.setPointsBench6(0);
		concorso.setPointsBench7(0);
		concorso.setPointsLineup1(0);
		concorso.setPointsLineup2(0);
		concorso.setPointsLineup3(0);
		concorso.setPointsLineup4(0);
		concorso.setPointsLineup5(0);
		concorso.setPointsLineup6(0);
		concorso.setPointsLineup7(0);
		concorso.setPointsLineup8(0);
		concorso.setPointsLineup9(0);
		concorso.setPointsLineup10(0);
		concorso.setPointsLineup11(0);
		concorso.setRuoloLineup1("string");
		concorso.setRuoloLineup2("string");
		concorso.setRuoloLineup3("string");
		concorso.setRuoloLineup4("string");
		concorso.setRuoloLineup5("string");
		concorso.setRuoloLineup6("string");
		concorso.setRuoloLineup7("string");
		concorso.setRuoloLineup8("string");
		concorso.setRuoloLineup9("string");
		concorso.setRuoloLineup10("string");
		concorso.setRuoloLineup11("string");
		concorso.setRuoloBench1("string");
		concorso.setRuoloBench2("string");
		concorso.setRuoloBench3("string");
		concorso.setRuoloBench4("string");
		concorso.setRuoloBench5("string");
		concorso.setRuoloBench6("string");
		concorso.setRuoloBench7("string");
		concorso.setTacticalInfo("string");
		concorso.setTacticalReal("string");
		concorso.setTeamName("Patetico Madrid");
		concorso.setTotalPoints(0);
		concorso.setTotalPointsWeekly(0);	
		
		return concorso;
	}

}
