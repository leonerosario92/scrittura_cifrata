package com.cgmconsulting.jsonserver.payload.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConcorsoRequest {

	private String team_name; 			// Nome Squadra
	private String player_name; 		// Nome Giocatore
	private String player_email; 		// E-mail giocatore
	
	/* RUOLI FORMAZIONE SCHIERATA + PANCHINA */
	private String ruolo_lineup_1; 		// Ruolo Titolare 1
	private String ruolo_lineup_2; 		// Ruolo Titolare 2 
	private String ruolo_lineup_3; 		// Ruolo Titolare 3
	private String ruolo_lineup_4; 		// Ruolo Titolare 4
	private String ruolo_lineup_5; 		// Ruolo Titolare 5
	private String ruolo_lineup_6; 		// Ruolo Titolare 6
	private String ruolo_lineup_7; 		// Ruolo Titolare 7
	private String ruolo_lineup_8; 		// Ruolo Titolare 8
	private String ruolo_lineup_9; 		// Ruolo Titolare 9
	private String ruolo_lineup_10; 	// Ruolo Titolare 10
	private String ruolo_lineup_11; 	// Ruolo Titolare 11
	private String ruolo_bench_1; 		// Ruolo Panchinaro 1
	private String ruolo_bench_2; 		// Ruolo Panchinaro 2
	private String ruolo_bench_3; 		// Ruolo Panchinaro 3
	private String ruolo_bench_4; 		// Ruolo Panchinaro 4
	private String ruolo_bench_5; 		// Ruolo Panchinaro 5
	private String ruolo_bench_6; 		// Ruolo Panchinaro 6
	private String ruolo_bench_7; 		// Ruolo Panchinaro 7
	
	/* MODULO UTILIZZATO */
	private String tactical_info; 		// Formazione schierata
	private String tactical_real; 		// Formazione realmente utilizzata
	
	/* PUNTI GIOCATORI IN FORMAZIONE + PANCHINA */
	private Double points_lineup_1; 		// Punteggio Titolare 1
	private Double points_lineup_2; 		// Punteggio Titolare 2
	private Double points_lineup_3; 		// Punteggio Titolare 3
	private Double points_lineup_4; 		// Punteggio Titolare 4
	private Double points_lineup_5; 		// Punteggio Titolare 5
	private Double points_lineup_6; 		// Punteggio Titolare 6
	private Double points_lineup_7; 		// Punteggio Titolare 7
	private Double points_lineup_8; 		// Punteggio Titolare 8
	private Double points_lineup_9; 		// Punteggio Titolare 9
	private Double points_lineup_10; 		// Punteggio Titolare 10
	private Double points_lineup_11; 		// Punteggio Titolare 11
	private Double points_bench_1; 		// Punteggio Panchinaro 1
	private Double points_bench_2; 		// Punteggio Panchinaro 2
	private Double points_bench_3; 		// Punteggio Panchinaro 3
	private Double points_bench_4; 		// Punteggio Panchinaro 4
	private Double points_bench_5; 		// Punteggio Panchinaro 5
	private Double points_bench_6; 		// Punteggio Panchinaro 6
	private Double points_bench_7; 		// Punteggio Panchinaro 7
	
	/* BONUS */
	private Double bonus_lineup_1;
	private Double bonus_lineup_2;
	private Double bonus_lineup_3;
	private Double bonus_lineup_4;
	private Double bonus_lineup_5;
	private Double bonus_lineup_6;
	private Double bonus_lineup_7;
	private Double bonus_lineup_8;
	private Double bonus_lineup_9;
	private Double bonus_lineup_10;
	private Double bonus_lineup_11;
	private Double bonus_bench_1;
	private Double bonus_bench_2;
	private Double bonus_bench_3;
	private Double bonus_bench_4;
	private Double bonus_bench_5;
	private Double bonus_bench_6;
	private Double bonus_bench_7;
	
	/* MALUS */
	private Double malus_lineup_1;
	private Double malus_lineup_2;
	private Double malus_lineup_3;
	private Double malus_lineup_4;
	private Double malus_lineup_5;
	private Double malus_lineup_6;
	private Double malus_lineup_7;
	private Double malus_lineup_8;
	private Double malus_lineup_9;
	private Double malus_lineup_10;
	private Double malus_lineup_11;
	private Double malus_bench_1;
	private Double malus_bench_2;
	private Double malus_bench_3;
	private Double malus_bench_4;
	private Double malus_bench_5;
	private Double malus_bench_6;
	private Double malus_bench_7;

	
	private Double total_points; 		// Punti Totali di squadra
	private Double total_points_weekly; // Punti Totali squadra della giornata
	
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPlayer_email() {
		return player_email;
	}
	public void setPlayer_email(String player_email) {
		this.player_email = player_email;
	}
	public String getRuolo_lineup_1() {
		return ruolo_lineup_1;
	}
	public void setRuolo_lineup_1(String ruolo_lineup_1) {
		this.ruolo_lineup_1 = ruolo_lineup_1;
	}
	public String getRuolo_lineup_2() {
		return ruolo_lineup_2;
	}
	public void setRuolo_lineup_2(String ruolo_lineup_2) {
		this.ruolo_lineup_2 = ruolo_lineup_2;
	}
	public String getRuolo_lineup_3() {
		return ruolo_lineup_3;
	}
	public void setRuolo_lineup_3(String ruolo_lineup_3) {
		this.ruolo_lineup_3 = ruolo_lineup_3;
	}
	public String getRuolo_lineup_4() {
		return ruolo_lineup_4;
	}
	public void setRuolo_lineup_4(String ruolo_lineup_4) {
		this.ruolo_lineup_4 = ruolo_lineup_4;
	}
	public String getRuolo_lineup_5() {
		return ruolo_lineup_5;
	}
	public void setRuolo_lineup_5(String ruolo_lineup_5) {
		this.ruolo_lineup_5 = ruolo_lineup_5;
	}
	public String getRuolo_lineup_6() {
		return ruolo_lineup_6;
	}
	public void setRuolo_lineup_6(String ruolo_lineup_6) {
		this.ruolo_lineup_6 = ruolo_lineup_6;
	}
	public String getRuolo_lineup_7() {
		return ruolo_lineup_7;
	}
	public void setRuolo_lineup_7(String ruolo_lineup_7) {
		this.ruolo_lineup_7 = ruolo_lineup_7;
	}
	public String getRuolo_lineup_8() {
		return ruolo_lineup_8;
	}
	public void setRuolo_lineup_8(String ruolo_lineup_8) {
		this.ruolo_lineup_8 = ruolo_lineup_8;
	}
	public String getRuolo_lineup_9() {
		return ruolo_lineup_9;
	}
	public void setRuolo_lineup_9(String ruolo_lineup_9) {
		this.ruolo_lineup_9 = ruolo_lineup_9;
	}
	public String getRuolo_lineup_10() {
		return ruolo_lineup_10;
	}
	public void setRuolo_lineup_10(String ruolo_lineup_10) {
		this.ruolo_lineup_10 = ruolo_lineup_10;
	}
	public String getRuolo_lineup_11() {
		return ruolo_lineup_11;
	}
	public void setRuolo_lineup_11(String ruolo_lineup_11) {
		this.ruolo_lineup_11 = ruolo_lineup_11;
	}
	public String getRuolo_bench_1() {
		return ruolo_bench_1;
	}
	public void setRuolo_bench_1(String ruolo_bench_1) {
		this.ruolo_bench_1 = ruolo_bench_1;
	}
	public String getRuolo_bench_2() {
		return ruolo_bench_2;
	}
	public void setRuolo_bench_2(String ruolo_bench_2) {
		this.ruolo_bench_2 = ruolo_bench_2;
	}
	public String getRuolo_bench_3() {
		return ruolo_bench_3;
	}
	public void setRuolo_bench_3(String ruolo_bench_3) {
		this.ruolo_bench_3 = ruolo_bench_3;
	}
	public String getRuolo_bench_4() {
		return ruolo_bench_4;
	}
	public void setRuolo_bench_4(String ruolo_bench_4) {
		this.ruolo_bench_4 = ruolo_bench_4;
	}
	public String getRuolo_bench_5() {
		return ruolo_bench_5;
	}
	public void setRuolo_bench_5(String ruolo_bench_5) {
		this.ruolo_bench_5 = ruolo_bench_5;
	}
	public String getRuolo_bench_6() {
		return ruolo_bench_6;
	}
	public void setRuolo_bench_6(String ruolo_bench_6) {
		this.ruolo_bench_6 = ruolo_bench_6;
	}
	public String getRuolo_bench_7() {
		return ruolo_bench_7;
	}
	public void setRuolo_bench_7(String ruolo_bench_7) {
		this.ruolo_bench_7 = ruolo_bench_7;
	}
	public String getTactical_info() {
		return tactical_info;
	}
	public void setTactical_info(String tactical_info) {
		this.tactical_info = tactical_info;
	}
	public String getTactical_real() {
		return tactical_real;
	}
	public void setTactical_real(String tactical_real) {
		this.tactical_real = tactical_real;
	}
	public Double getPoints_lineup_1() {
		return points_lineup_1;
	}
	public void setPoints_lineup_1(Double points_lineup_1) {
		this.points_lineup_1 = points_lineup_1;
	}
	public Double getPoints_lineup_2() {
		return points_lineup_2;
	}
	public void setPoints_lineup_2(Double points_lineup_2) {
		this.points_lineup_2 = points_lineup_2;
	}
	public Double getPoints_lineup_3() {
		return points_lineup_3;
	}
	public void setPoints_lineup_3(Double points_lineup_3) {
		this.points_lineup_3 = points_lineup_3;
	}
	public Double getPoints_lineup_4() {
		return points_lineup_4;
	}
	public void setPoints_lineup_4(Double points_lineup_4) {
		this.points_lineup_4 = points_lineup_4;
	}
	public Double getPoints_lineup_5() {
		return points_lineup_5;
	}
	public void setPoints_lineup_5(Double points_lineup_5) {
		this.points_lineup_5 = points_lineup_5;
	}
	public Double getPoints_lineup_6() {
		return points_lineup_6;
	}
	public void setPoints_lineup_6(Double points_lineup_6) {
		this.points_lineup_6 = points_lineup_6;
	}
	public Double getPoints_lineup_7() {
		return points_lineup_7;
	}
	public void setPoints_lineup_7(Double points_lineup_7) {
		this.points_lineup_7 = points_lineup_7;
	}
	public Double getPoints_lineup_8() {
		return points_lineup_8;
	}
	public void setPoints_lineup_8(Double points_lineup_8) {
		this.points_lineup_8 = points_lineup_8;
	}
	public Double getPoints_lineup_9() {
		return points_lineup_9;
	}
	public void setPoints_lineup_9(Double points_lineup_9) {
		this.points_lineup_9 = points_lineup_9;
	}
	public Double getPoints_lineup_10() {
		return points_lineup_10;
	}
	public void setPoints_lineup_10(Double points_lineup_10) {
		this.points_lineup_10 = points_lineup_10;
	}
	public Double getPoints_lineup_11() {
		return points_lineup_11;
	}
	public void setPoints_lineup_11(Double points_lineup_11) {
		this.points_lineup_11 = points_lineup_11;
	}
	public Double getPoints_bench_1() {
		return points_bench_1;
	}
	public void setPoints_bench_1(Double points_bench_1) {
		this.points_bench_1 = points_bench_1;
	}
	public Double getPoints_bench_2() {
		return points_bench_2;
	}
	public void setPoints_bench_2(Double points_bench_2) {
		this.points_bench_2 = points_bench_2;
	}
	public Double getPoints_bench_3() {
		return points_bench_3;
	}
	public void setPoints_bench_3(Double points_bench_3) {
		this.points_bench_3 = points_bench_3;
	}
	public Double getPoints_bench_4() {
		return points_bench_4;
	}
	public void setPoints_bench_4(Double points_bench_4) {
		this.points_bench_4 = points_bench_4;
	}
	public Double getPoints_bench_5() {
		return points_bench_5;
	}
	public void setPoints_bench_5(Double points_bench_5) {
		this.points_bench_5 = points_bench_5;
	}
	public Double getPoints_bench_6() {
		return points_bench_6;
	}
	public void setPoints_bench_6(Double points_bench_6) {
		this.points_bench_6 = points_bench_6;
	}
	public Double getPoints_bench_7() {
		return points_bench_7;
	}
	public void setPoints_bench_7(Double points_bench_7) {
		this.points_bench_7 = points_bench_7;
	}
	public Double getBonus_lineup_1() {
		return bonus_lineup_1;
	}
	public void setBonus_lineup_1(Double bonus_lineup_1) {
		this.bonus_lineup_1 = bonus_lineup_1;
	}
	public Double getBonus_lineup_2() {
		return bonus_lineup_2;
	}
	public void setBonus_lineup_2(Double bonus_lineup_2) {
		this.bonus_lineup_2 = bonus_lineup_2;
	}
	public Double getBonus_lineup_3() {
		return bonus_lineup_3;
	}
	public void setBonus_lineup_3(Double bonus_lineup_3) {
		this.bonus_lineup_3 = bonus_lineup_3;
	}
	public Double getBonus_lineup_4() {
		return bonus_lineup_4;
	}
	public void setBonus_lineup_4(Double bonus_lineup_4) {
		this.bonus_lineup_4 = bonus_lineup_4;
	}
	public Double getBonus_lineup_5() {
		return bonus_lineup_5;
	}
	public void setBonus_lineup_5(Double bonus_lineup_5) {
		this.bonus_lineup_5 = bonus_lineup_5;
	}
	public Double getBonus_lineup_6() {
		return bonus_lineup_6;
	}
	public void setBonus_lineup_6(Double bonus_lineup_6) {
		this.bonus_lineup_6 = bonus_lineup_6;
	}
	public Double getBonus_lineup_7() {
		return bonus_lineup_7;
	}
	public void setBonus_lineup_7(Double bonus_lineup_7) {
		this.bonus_lineup_7 = bonus_lineup_7;
	}
	public Double getBonus_lineup_8() {
		return bonus_lineup_8;
	}
	public void setBonus_lineup_8(Double bonus_lineup_8) {
		this.bonus_lineup_8 = bonus_lineup_8;
	}
	public Double getBonus_lineup_9() {
		return bonus_lineup_9;
	}
	public void setBonus_lineup_9(Double bonus_lineup_9) {
		this.bonus_lineup_9 = bonus_lineup_9;
	}
	public Double getBonus_lineup_10() {
		return bonus_lineup_10;
	}
	public void setBonus_lineup_10(Double bonus_lineup_10) {
		this.bonus_lineup_10 = bonus_lineup_10;
	}
	public Double getBonus_lineup_11() {
		return bonus_lineup_11;
	}
	public void setBonus_lineup_11(Double bonus_lineup_11) {
		this.bonus_lineup_11 = bonus_lineup_11;
	}
	public Double getBonus_bench_1() {
		return bonus_bench_1;
	}
	public void setBonus_bench_1(Double bonus_bench_1) {
		this.bonus_bench_1 = bonus_bench_1;
	}
	public Double getBonus_bench_2() {
		return bonus_bench_2;
	}
	public void setBonus_bench_2(Double bonus_bench_2) {
		this.bonus_bench_2 = bonus_bench_2;
	}
	public Double getBonus_bench_3() {
		return bonus_bench_3;
	}
	public void setBonus_bench_3(Double bonus_bench_3) {
		this.bonus_bench_3 = bonus_bench_3;
	}
	public Double getBonus_bench_4() {
		return bonus_bench_4;
	}
	public void setBonus_bench_4(Double bonus_bench_4) {
		this.bonus_bench_4 = bonus_bench_4;
	}
	public Double getBonus_bench_5() {
		return bonus_bench_5;
	}
	public void setBonus_bench_5(Double bonus_bench_5) {
		this.bonus_bench_5 = bonus_bench_5;
	}
	public Double getBonus_bench_6() {
		return bonus_bench_6;
	}
	public void setBonus_bench_6(Double bonus_bench_6) {
		this.bonus_bench_6 = bonus_bench_6;
	}
	public Double getBonus_bench_7() {
		return bonus_bench_7;
	}
	public void setBonus_bench_7(Double bonus_bench_7) {
		this.bonus_bench_7 = bonus_bench_7;
	}
	public Double getMalus_lineup_1() {
		return malus_lineup_1;
	}
	public void setMalus_lineup_1(Double malus_lineup_1) {
		this.malus_lineup_1 = malus_lineup_1;
	}
	public Double getMalus_lineup_2() {
		return malus_lineup_2;
	}
	public void setMalus_lineup_2(Double malus_lineup_2) {
		this.malus_lineup_2 = malus_lineup_2;
	}
	public Double getMalus_lineup_3() {
		return malus_lineup_3;
	}
	public void setMalus_lineup_3(Double malus_lineup_3) {
		this.malus_lineup_3 = malus_lineup_3;
	}
	public Double getMalus_lineup_4() {
		return malus_lineup_4;
	}
	public void setMalus_lineup_4(Double malus_lineup_4) {
		this.malus_lineup_4 = malus_lineup_4;
	}
	public Double getMalus_lineup_5() {
		return malus_lineup_5;
	}
	public void setMalus_lineup_5(Double malus_lineup_5) {
		this.malus_lineup_5 = malus_lineup_5;
	}
	public Double getMalus_lineup_6() {
		return malus_lineup_6;
	}
	public void setMalus_lineup_6(Double malus_lineup_6) {
		this.malus_lineup_6 = malus_lineup_6;
	}
	public Double getMalus_lineup_7() {
		return malus_lineup_7;
	}
	public void setMalus_lineup_7(Double malus_lineup_7) {
		this.malus_lineup_7 = malus_lineup_7;
	}
	public Double getMalus_lineup_8() {
		return malus_lineup_8;
	}
	public void setMalus_lineup_8(Double malus_lineup_8) {
		this.malus_lineup_8 = malus_lineup_8;
	}
	public Double getMalus_lineup_9() {
		return malus_lineup_9;
	}
	public void setMalus_lineup_9(Double malus_lineup_9) {
		this.malus_lineup_9 = malus_lineup_9;
	}
	public Double getMalus_lineup_10() {
		return malus_lineup_10;
	}
	public void setMalus_lineup_10(Double malus_lineup_10) {
		this.malus_lineup_10 = malus_lineup_10;
	}
	public Double getMalus_lineup_11() {
		return malus_lineup_11;
	}
	public void setMalus_lineup_11(Double malus_lineup_11) {
		this.malus_lineup_11 = malus_lineup_11;
	}
	public Double getMalus_bench_1() {
		return malus_bench_1;
	}
	public void setMalus_bench_1(Double malus_bench_1) {
		this.malus_bench_1 = malus_bench_1;
	}
	public Double getMalus_bench_2() {
		return malus_bench_2;
	}
	public void setMalus_bench_2(Double malus_bench_2) {
		this.malus_bench_2 = malus_bench_2;
	}
	public Double getMalus_bench_3() {
		return malus_bench_3;
	}
	public void setMalus_bench_3(Double malus_bench_3) {
		this.malus_bench_3 = malus_bench_3;
	}
	public Double getMalus_bench_4() {
		return malus_bench_4;
	}
	public void setMalus_bench_4(Double malus_bench_4) {
		this.malus_bench_4 = malus_bench_4;
	}
	public Double getMalus_bench_5() {
		return malus_bench_5;
	}
	public void setMalus_bench_5(Double malus_bench_5) {
		this.malus_bench_5 = malus_bench_5;
	}
	public Double getMalus_bench_6() {
		return malus_bench_6;
	}
	public void setMalus_bench_6(Double malus_bench_6) {
		this.malus_bench_6 = malus_bench_6;
	}
	public Double getMalus_bench_7() {
		return malus_bench_7;
	}
	public void setMalus_bench_7(Double malus_bench_7) {
		this.malus_bench_7 = malus_bench_7;
	}
	public Double getTotal_points() {
		return total_points;
	}
	public void setTotal_points(Double total_points) {
		this.total_points = total_points;
	}
	public Double getTotal_points_weekly() {
		return total_points_weekly;
	}
	public void setTotal_points_weekly(Double total_points_weekly) {
		this.total_points_weekly = total_points_weekly;
	}
	public Integer getWorse_player_1_points() {
		return worse_player_1_points;
	}
	public void setWorse_player_1_points(Integer worse_player_1_points) {
		this.worse_player_1_points = worse_player_1_points;
	}
	public Integer getWorse_player_2_points() {
		return worse_player_2_points;
	}
	public void setWorse_player_2_points(Integer worse_player_2_points) {
		this.worse_player_2_points = worse_player_2_points;
	}
	public Integer getBest_player_1_poitns() {
		return best_player_1_poitns;
	}
	public void setBest_player_1_poitns(Integer best_player_1_poitns) {
		this.best_player_1_poitns = best_player_1_poitns;
	}
	public Integer getBest_player_2_poitns() {
		return best_player_2_poitns;
	}
	public void setBest_player_2_poitns(Integer best_player_2_poitns) {
		this.best_player_2_poitns = best_player_2_poitns;
	}
	private Integer worse_player_1_points;
	private Integer worse_player_2_points;
	private Integer best_player_1_poitns;
	private Integer best_player_2_poitns;
}
