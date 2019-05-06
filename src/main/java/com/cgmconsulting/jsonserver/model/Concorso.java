package com.cgmconsulting.jsonserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cgmconsulting.jsonserver.utils.EncryptionUtils;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name = "concorso")
public class Concorso {
	
	private static final String SECRET_KEY = "1234";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return this.id;
	}
	
	/* DATI DEL TEAM */
	@Column(nullable = false)
	private String team_name; 			// Nome Squadra
	@Column(nullable = false)
	private String player_name; 		// Nome Giocatore
	@Column(nullable = false)
	@Lob
	private byte[] player_email; 		// E-mail giocatore
	
	/* FORMAZIONE SCHIERATA + PANCHINA */
	private String lineup_1; 			// Titolare 1
	private String lineup_2; 			// Titolare 2 
	private String lineup_3; 			// Titolare 3
	private String lineup_4; 			// Titolare 4
	private String lineup_5; 			// Titolare 5
	private String lineup_6; 			// Titolare 6
	private String lineup_7; 			// Titolare 7
	private String lineup_8; 			// Titolare 8
	private String lineup_9; 			// Titolare 9
	private String lineup_10; 			// Titolare 10
	private String lineup_11; 			// Titolare 11
	private String bench_1; 			// Panchinaro 1
	private String bench_2; 			// Panchinaro 2
	private String bench_3; 			// Panchinaro 3
	private String bench_4; 			// Panchinaro 4
	private String bench_5; 			// Panchinaro 5
	private String bench_6; 			// Panchinaro 6
	private String bench_7; 			// Panchinaro 7
	
	/* RUOLI FORMAZIONE SCHIERATA + PANCHINA */
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_1; 		// Ruolo Titolare 1
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_2; 		// Ruolo Titolare 2 
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_3; 		// Ruolo Titolare 3
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_4; 		// Ruolo Titolare 4
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_5; 		// Ruolo Titolare 5
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_6; 		// Ruolo Titolare 6
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_7; 		// Ruolo Titolare 7
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_8; 		// Ruolo Titolare 8
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_9; 		// Ruolo Titolare 9
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_10; 	// Ruolo Titolare 10
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_lineup_11; 	// Ruolo Titolare 11
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_1; 		// Ruolo Panchinaro 1
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_2; 		// Ruolo Panchinaro 2
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_3; 		// Ruolo Panchinaro 3
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_4; 		// Ruolo Panchinaro 4
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_5; 		// Ruolo Panchinaro 5
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_6; 		// Ruolo Panchinaro 6
	@Column(columnDefinition="varchar(20)", nullable = false)
	private String ruolo_bench_7; 		// Ruolo Panchinaro 7
	
	/* MODULO UTILIZZATO */
	@Column(columnDefinition="varchar(10)", nullable = false)
	private String tactical_info; 		// Formazione schierata
	@Column(columnDefinition="varchar(10)", nullable = false)
	private String tactical_real; 		// Formazione realmente utilizzata
	
	/* PUNTI GIOCATORI IN FORMAZIONE + PANCHINA */
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_1; 		// Punteggio Titolare 1
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_2; 		// Punteggio Titolare 2
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_3; 		// Punteggio Titolare 3
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_4; 		// Punteggio Titolare 4
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_5; 		// Punteggio Titolare 5
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_6; 		// Punteggio Titolare 6
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_7; 		// Punteggio Titolare 7
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_8; 		// Punteggio Titolare 8
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_9; 		// Punteggio Titolare 9
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_10; 		// Punteggio Titolare 10
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_lineup_11; 		// Punteggio Titolare 11
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_1; 		// Punteggio Panchinaro 1
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_2; 		// Punteggio Panchinaro 2
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_3; 		// Punteggio Panchinaro 3
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_4; 		// Punteggio Panchinaro 4
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_5; 		// Punteggio Panchinaro 5
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_6; 		// Punteggio Panchinaro 6
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double points_bench_7; 		// Punteggio Panchinaro 7
	
	/* BONUS */
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_1;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_2;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_3;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_4;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_5;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_6;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_7;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_8;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_9;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_10;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_lineup_11;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_1;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_2;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_3;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_4;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_5;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_6;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double bonus_bench_7;
	
	/* MALUS */
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_1;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_2;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_3;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_4;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_5;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_6;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_7;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_8;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_9;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_10;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_lineup_11;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_1;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_2;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_3;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_4;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_5;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_6;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private double malus_bench_7;

	
	/* SOSTITUZIONI */
	private String first_sub_out;
	private String first_sub_in;
	private String second_sub_out;
	private String second_sub_in;
	private String third_sub_out;
	private String third_sub_in;
	
	@Column(columnDefinition="Decimal(7,2) default '00.00'", nullable = false)
	private double total_points; 		// Punti Totali di squadra
	@Column(columnDefinition="Decimal(5,2) default '00.00'", nullable = false)
	private double total_points_weekly; // Punti Totali squadra della giornata
	@Column(columnDefinition="int(7)")
	private int total_team_position; 	// Posizione in classifica globale
	@Column(columnDefinition="int(7)")
	private int weekly_team_position; 	// Posizione in classifica settimanale
	
	@Column(columnDefinition="int(7)")
	private int total_team_position_previous;
	@Column(columnDefinition="int(7)")
	private int weekly_team_position_previous;
	
	@Column(columnDefinition="int(7)")
	private int delta_total_position;
	@Column(columnDefinition="int(7)")
	private int delta_weekly_position;

	@Column(columnDefinition="int(3)")
	private int total_goal;
	@Column(columnDefinition="int(3)")
	private int total_penalty_saved;
	@Column(columnDefinition="int(3)")
	private int total_assist;
	@Column(columnDefinition="int(5)")
	private int total_mvp_player;
	@Column(columnDefinition="int(3)")
	private int total_red_card;
	@Column(columnDefinition="int(3)")
	private int total_yellow_card;
	
	@Column(columnDefinition="int(3)")
	private int total_goal_conceded;
	@Column(columnDefinition="int(3)")
	private int total_penalty_missed;
	@Column(columnDefinition="int(3)")
	private int total_own_goal;
	
	private String best_player_1;
	private String best_player_2;
	private String worse_player_1;
	private String worse_player_2;
	
	@Column(columnDefinition="int(3)")
	private int best_player_1_gol;
	@Column(columnDefinition="int(3)")
	private int best_player_1_penalty_saved;
	@Column(columnDefinition="int(3)")
	private String best_player_1_mvp;
	@Column(columnDefinition="int(3)")
	private int best_player_1_assist;
	@Column(columnDefinition="int(3)")
	private int best_player_2_gol;
	@Column(columnDefinition="int(3)")
	private int best_player_2_penalty_saved;
	@Column(columnDefinition="int(3)")
	private String best_player_2_mvp;
	@Column(columnDefinition="int(3)")
	private int best_player_2_assist;
	
	@Column(columnDefinition="int(3)")
	private int worse_player_1_owngoal;
	@Column(columnDefinition="int(3)")
	private int worse_player_1_penalty_missed;
	@Column(columnDefinition="int(3)")
	private int worse_player_1_goal_conceded;
	@Column(columnDefinition="int(3)")
	private int worse_player_1_yellow_card;
	@Column(columnDefinition="int(3)")
	private int worse_player_1_red_card;
	@Column(columnDefinition="int(3)")
	private int worse_player_2_owngoal;
	@Column(columnDefinition="int(3)")
	private int worse_player_2_penalty_missed;
	@Column(columnDefinition="int(3)")
	private int worse_player_2_goal_conceded;
	@Column(columnDefinition="int(3)")
	private int worse_player_2_yellow_card;
	@Column(columnDefinition="int(3)")
	private int worse_player_2_red_card;

	@Column(columnDefinition="int(3)")
	private int price_lineup_1;
	@Column(columnDefinition="int(3)")
	private int price_lineup_2;
	@Column(columnDefinition="int(3)")
	private int price_lineup_3;
	@Column(columnDefinition="int(3)")
	private int price_lineup_4;
	@Column(columnDefinition="int(3)")
	private int price_lineup_5;
	@Column(columnDefinition="int(3)")
	private int price_lineup_6;
	@Column(columnDefinition="int(3)")
	private int price_lineup_7;
	@Column(columnDefinition="int(3)")
	private int price_lineup_8;
	@Column(columnDefinition="int(3)")
	private int price_lineup_9;
	@Column(columnDefinition="int(3)")
	private int price_lineup_10;
	@Column(columnDefinition="int(3)")
	private int price_lineup_11;
	@Column(columnDefinition="int(3)")
	private int price_bench_1;
	@Column(columnDefinition="int(3)")
	private int price_bench_2;
	@Column(columnDefinition="int(3)")
	private int price_bench_3;
	@Column(columnDefinition="int(3)")
	private int price_bench_4;
	@Column(columnDefinition="int(3)")
	private int price_bench_5;
	@Column(columnDefinition="int(3)")
	private int price_bench_6;
	@Column(columnDefinition="int(3)")
	private int price_bench_7;
	
	@Column(columnDefinition="int(3)")
	private int price_lineup_1_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_2_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_3_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_4_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_5_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_6_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_7_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_8_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_9_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_10_previous;
	@Column(columnDefinition="int(3)")
	private int price_lineup_11_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_1_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_2_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_3_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_4_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_5_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_6_previous;
	@Column(columnDefinition="int(3)")
	private int price_bench_7_previous;
	
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_1;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_2;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_3;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_4;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_5;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_6;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_7;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_8;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_9;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_10;
	@Column(columnDefinition="int(3)")
	private int delta_price_lineup_11;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_1;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_2;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_3;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_4;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_5;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_6;
	@Column(columnDefinition="int(3)")
	private int delta_price_bench_7;
	
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private int worse_player_1_points;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private int worse_player_2_points;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private int best_player_1_poitns;
	@Column(columnDefinition="Decimal(4,2) default '00.00'", nullable = false)
	private int best_player_2_poitns;

	@Temporal(TemporalType.DATE)
	private Date upload_date;
	
	public String getTeamName() {
		return team_name;
	}
	public void setTeamName(String teamName) {
		this.team_name = teamName;
	}
	public String getPlayerName() {
		return player_name;
	}
	public void setPlayerName(String playerName) {
		this.player_name = playerName;
	}
	public String getPlayerEmail() {
		return EncryptionUtils.decrypt(this.player_email);
	}
	public void setPlayerEmail(String playerEmail) {
		this.player_email = EncryptionUtils.encrypt(playerEmail);
	}
	public String getLineup1() {
		return lineup_1;
	}
	public void setLineup1(String lineup1) {
		this.lineup_1 = lineup1;
	}
	public String getLineup2() {
		return lineup_2;
	}
	public void setLineup2(String lineup2) {
		this.lineup_2 = lineup2;
	}
	public String getLineup3() {
		return lineup_3;
	}
	public void setLineup3(String lineup3) {
		this.lineup_3 = lineup3;
	}
	public String getLineup4() {
		return lineup_4;
	}
	public void setLineup4(String lineup4) {
		this.lineup_4 = lineup4;
	}
	public String getLineup5() {
		return lineup_5;
	}
	public void setLineup5(String lineup5) {
		this.lineup_5 = lineup5;
	}
	public String getLineup6() {
		return lineup_6;
	}
	public void setLineup6(String lineup6) {
		this.lineup_6 = lineup6;
	}
	public String getLineup7() {
		return lineup_7;
	}
	public void setLineup7(String lineup7) {
		this.lineup_7 = lineup7;
	}
	public String getLineup8() {
		return lineup_8;
	}
	public void setLineup8(String lineup8) {
		this.lineup_8 = lineup8;
	}
	public String getLineup9() {
		return lineup_9;
	}
	public void setLineup9(String lineup9) {
		this.lineup_9 = lineup9;
	}
	public String getLineup10() {
		return lineup_10;
	}
	public void setLineup10(String lineup10) {
		this.lineup_10 = lineup10;
	}
	public String getLineup11() {
		return lineup_11;
	}
	public void setLineup11(String lineup11) {
		this.lineup_11 = lineup11;
	}
	public String getBench1() {
		return bench_1;
	}
	public void setBench1(String bench1) {
		this.bench_1 = bench1;
	}
	public String getBench2() {
		return bench_2;
	}
	public void setBench2(String bench2) {
		this.bench_2 = bench2;
	}
	public String getBench3() {
		return bench_3;
	}
	public void setBench3(String bench3) {
		this.bench_3 = bench3;
	}
	public String getBench4() {
		return bench_4;
	}
	public void setBench4(String bench4) {
		this.bench_4 = bench4;
	}
	public String getBench5() {
		return bench_5;
	}
	public void setBench5(String bench5) {
		this.bench_5 = bench5;
	}
	public String getBench6() {
		return bench_6;
	}
	public void setBench6(String bench6) {
		this.bench_6 = bench6;
	}
	public String getBench7() {
		return bench_7;
	}
	public void setBench7(String bench7) {
		this.bench_7 = bench7;
	}
	public String getRuoloLineup1() {
		return ruolo_lineup_1;
	}
	public void setRuoloLineup1(String ruoloLineup1) {
		this.ruolo_lineup_1 = ruoloLineup1;
	}
	public String getRuoloLineup2() {
		return ruolo_lineup_2;
	}
	public void setRuoloLineup2(String ruoloLineup2) {
		this.ruolo_lineup_2 = ruoloLineup2;
	}
	public String getRuoloLineup3() {
		return ruolo_lineup_3;
	}
	public void setRuoloLineup3(String ruoloLineup3) {
		this.ruolo_lineup_3 = ruoloLineup3;
	}
	public String getRuoloLineup4() {
		return ruolo_lineup_4;
	}
	public void setRuoloLineup4(String ruoloLineup4) {
		this.ruolo_lineup_4 = ruoloLineup4;
	}
	public String getRuoloLineup5() {
		return ruolo_lineup_5;
	}
	public void setRuoloLineup5(String ruoloLineup5) {
		this.ruolo_lineup_5 = ruoloLineup5;
	}
	public String getRuoloLineup6() {
		return ruolo_lineup_6;
	}
	public void setRuoloLineup6(String ruoloLineup6) {
		this.ruolo_lineup_6 = ruoloLineup6;
	}
	public String getRuoloLineup7() {
		return ruolo_lineup_7;
	}
	public void setRuoloLineup7(String ruoloLineup7) {
		this.ruolo_lineup_7 = ruoloLineup7;
	}
	public String getRuoloLineup8() {
		return ruolo_lineup_8;
	}
	public void setRuoloLineup8(String ruoloLineup8) {
		this.ruolo_lineup_8 = ruoloLineup8;
	}
	public String getRuoloLineup9() {
		return ruolo_lineup_9;
	}
	public void setRuoloLineup9(String ruoloLineup9) {
		this.ruolo_lineup_9 = ruoloLineup9;
	}
	public String getRuoloLineup10() {
		return ruolo_lineup_10;
	}
	public void setRuoloLineup10(String ruoloLineup10) {
		this.ruolo_lineup_10 = ruoloLineup10;
	}
	public String getRuoloLineup11() {
		return ruolo_lineup_11;
	}
	public void setRuoloLineup11(String ruoloLineup11) {
		this.ruolo_lineup_11 = ruoloLineup11;
	}
	public String getRuoloBench1() {
		return ruolo_bench_1;
	}
	public void setRuoloBench1(String ruoloBench1) {
		this.ruolo_bench_1 = ruoloBench1;
	}
	public String getRuoloBench2() {
		return ruolo_bench_2;
	}
	public void setRuoloBench2(String ruoloBench2) {
		this.ruolo_bench_2 = ruoloBench2;
	}
	public String getRuoloBench3() {
		return ruolo_bench_3;
	}
	public void setRuoloBench3(String ruoloBench3) {
		this.ruolo_bench_3 = ruoloBench3;
	}
	public String getRuoloBench4() {
		return ruolo_bench_4;
	}
	public void setRuoloBench4(String ruoloBench4) {
		this.ruolo_bench_4 = ruoloBench4;
	}
	public String getRuoloBench5() {
		return ruolo_bench_5;
	}
	public void setRuoloBench5(String ruoloBench5) {
		this.ruolo_bench_5 = ruoloBench5;
	}
	public String getRuoloBench6() {
		return ruolo_bench_6;
	}
	public void setRuoloBench6(String ruoloBench6) {
		this.ruolo_bench_6 = ruoloBench6;
	}
	public String getRuoloBench7() {
		return ruolo_bench_7;
	}
	public void setRuoloBench7(String ruoloBench7) {
		this.ruolo_bench_7 = ruoloBench7;
	}
	public String getTacticalInfo() {
		return tactical_info;
	}
	public void setTacticalInfo(String tacticalInfo) {
		this.tactical_info = tacticalInfo;
	}
	public String getTacticalReal() {
		return tactical_real;
	}
	public void setTacticalReal(String tacticalReal) {
		this.tactical_real = tacticalReal;
	}
	public double getPointsLineup1() {
		return points_lineup_1;
	}
	public void setPointsLineup1(double pointsLineup1) {
		this.points_lineup_1 = pointsLineup1;
	}
	public double getPointsLineup2() {
		return points_lineup_2;
	}
	public void setPointsLineup2(double pointsLineup2) {
		this.points_lineup_2 = pointsLineup2;
	}
	public double getPointsLineup3() {
		return points_lineup_3;
	}
	public void setPointsLineup3(double pointsLineup3) {
		this.points_lineup_3 = pointsLineup3;
	}
	public double getPointsLineup4() {
		return points_lineup_4;
	}
	public void setPointsLineup4(double pointsLineup4) {
		this.points_lineup_4 = pointsLineup4;
	}
	public double getPointsLineup5() {
		return points_lineup_5;
	}
	public void setPointsLineup5(double pointsLineup5) {
		this.points_lineup_5 = pointsLineup5;
	}
	public double getPointsLineup6() {
		return points_lineup_6;
	}
	public void setPointsLineup6(double pointsLineup6) {
		this.points_lineup_6 = pointsLineup6;
	}
	public double getPointsLineup7() {
		return points_lineup_7;
	}
	public void setPointsLineup7(double pointsLineup7) {
		this.points_lineup_7 = pointsLineup7;
	}
	public double getPointsLineup8() {
		return points_lineup_8;
	}
	public void setPointsLineup8(double pointsLineup8) {
		this.points_lineup_8 = pointsLineup8;
	}
	public double getPointsLineup9() {
		return points_lineup_9;
	}
	public void setPointsLineup9(double pointsLineup9) {
		this.points_lineup_9 = pointsLineup9;
	}
	public double getPointsLineup10() {
		return points_lineup_10;
	}
	public void setPointsLineup10(double pointsLineup10) {
		this.points_lineup_10 = pointsLineup10;
	}
	public double getPointsLineup11() {
		return points_lineup_11;
	}
	public void setPointsLineup11(double pointsLineup11) {
		this.points_lineup_11 = pointsLineup11;
	}
	public double getPointsBench1() {
		return points_bench_1;
	}
	public void setPointsBench1(double pointsBench1) {
		this.points_bench_1 = pointsBench1;
	}
	public double getPointsBench2() {
		return points_bench_2;
	}
	public void setPointsBench2(double pointsBench2) {
		this.points_bench_2 = pointsBench2;
	}
	public double getPointsBench3() {
		return points_bench_3;
	}
	public void setPointsBench3(double pointsBench3) {
		this.points_bench_3 = pointsBench3;
	}
	public double getPointsBench4() {
		return points_bench_4;
	}
	public void setPointsBench4(double pointsBench4) {
		this.points_bench_4 = pointsBench4;
	}
	public double getPointsBench5() {
		return points_bench_5;
	}
	public void setPointsBench5(double pointsBench5) {
		this.points_bench_5 = pointsBench5;
	}
	public double getPointsBench6() {
		return points_bench_6;
	}
	public void setPointsBench6(double pointsBench6) {
		this.points_bench_6 = pointsBench6;
	}
	public double getPointsBench7() {
		return points_bench_7;
	}
	public void setPointsBench7(double pointsBench7) {
		this.points_bench_7 = pointsBench7;
	}
	public double getBonusLineup1() {
		return bonus_lineup_1;
	}
	public void setBonusLineup1(double bonusLineup1) {
		this.bonus_lineup_1 = bonusLineup1;
	}
	public double getBonusLineup2() {
		return bonus_lineup_2;
	}
	public void setBonusLineup2(double bonusLineup2) {
		this.bonus_lineup_2 = bonusLineup2;
	}
	public double getBonusLineup3() {
		return bonus_lineup_3;
	}
	public void setBonusLineup3(double bonusLineup3) {
		this.bonus_lineup_3 = bonusLineup3;
	}
	public double getBonusLineup4() {
		return bonus_lineup_4;
	}
	public void setBonusLineup4(double bonusLineup4) {
		this.bonus_lineup_4 = bonusLineup4;
	}
	public double getBonusLineup5() {
		return bonus_lineup_5;
	}
	public void setBonusLineup5(double bonusLineup5) {
		this.bonus_lineup_5 = bonusLineup5;
	}
	public double getBonusLineup6() {
		return bonus_lineup_6;
	}
	public void setBonusLineup6(double bonusLineup6) {
		this.bonus_lineup_6 = bonusLineup6;
	}
	public double getBonusLineup7() {
		return bonus_lineup_7;
	}
	public void setBonusLineup7(double bonusLineup7) {
		this.bonus_lineup_7 = bonusLineup7;
	}
	public double getBonusLineup8() {
		return bonus_lineup_8;
	}
	public void setBonusLineup8(double bonusLineup8) {
		this.bonus_lineup_8 = bonusLineup8;
	}
	public double getBonusLineup9() {
		return bonus_lineup_9;
	}
	public void setBonusLineup9(double bonusLineup9) {
		this.bonus_lineup_9 = bonusLineup9;
	}
	public double getBonusLineup10() {
		return bonus_lineup_10;
	}
	public void setBonusLineup10(double bonusLineup10) {
		this.bonus_lineup_10 = bonusLineup10;
	}
	public double getBonusLineup11() {
		return bonus_lineup_11;
	}
	public void setBonusLineup11(double bonusLineup11) {
		this.bonus_lineup_11 = bonusLineup11;
	}
	public double getBonusBench1() {
		return bonus_bench_1;
	}
	public void setBonusBench1(double bonusBench1) {
		this.bonus_bench_1 = bonusBench1;
	}
	public double getBonusBench2() {
		return bonus_bench_2;
	}
	public void setBonusBench2(double bonusBench2) {
		this.bonus_bench_2 = bonusBench2;
	}
	public double getBonusBench3() {
		return bonus_bench_3;
	}
	public void setBonusBench3(double bonusBench3) {
		this.bonus_bench_3 = bonusBench3;
	}
	public double getBonusBench4() {
		return bonus_bench_4;
	}
	public void setBonusBench4(double bonusBench4) {
		this.bonus_bench_4 = bonusBench4;
	}
	public double getBonusBench5() {
		return bonus_bench_5;
	}
	public void setBonusBench5(double bonusBench5) {
		this.bonus_bench_5 = bonusBench5;
	}
	public double getBonusBench6() {
		return bonus_bench_6;
	}
	public void setBonusBench6(double bonusBench6) {
		this.bonus_bench_6 = bonusBench6;
	}
	public double getBonusBench7() {
		return bonus_bench_7;
	}
	public void setBonusBench7(double bonusBench7) {
		this.bonus_bench_7 = bonusBench7;
	}
	public double getMalusLineup1() {
		return malus_lineup_1;
	}
	public void setMalusLineup1(double malusLineup1) {
		this.malus_lineup_1 = malusLineup1;
	}
	public double getMalusLineup2() {
		return malus_lineup_2;
	}
	public void setMalusLineup2(double malusLineup2) {
		this.malus_lineup_2 = malusLineup2;
	}
	public double getMalusLineup3() {
		return malus_lineup_3;
	}
	public void setMalusLineup3(double malusLineup3) {
		this.malus_lineup_3 = malusLineup3;
	}
	public double getMalusLineup4() {
		return malus_lineup_4;
	}
	public void setMalusLineup4(double malusLineup4) {
		this.malus_lineup_4 = malusLineup4;
	}
	public double getMalusLineup5() {
		return malus_lineup_5;
	}
	public void setMalusLineup5(double malusLineup5) {
		this.malus_lineup_5 = malusLineup5;
	}
	public double getMalusLineup6() {
		return malus_lineup_6;
	}
	public void setMalusLineup6(double malusLineup6) {
		this.malus_lineup_6 = malusLineup6;
	}
	public double getMalusLineup7() {
		return malus_lineup_7;
	}
	public void setMalusLineup7(double malusLineup7) {
		this.malus_lineup_7 = malusLineup7;
	}
	public double getMalusLineup8() {
		return malus_lineup_8;
	}
	public void setMalusLineup8(double malusLineup8) {
		this.malus_lineup_8 = malusLineup8;
	}
	public double getMalusLineup9() {
		return malus_lineup_9;
	}
	public void setMalusLineup9(double malusLineup9) {
		this.malus_lineup_9 = malusLineup9;
	}
	public double getMalusLineup10() {
		return malus_lineup_10;
	}
	public void setMalusLineup10(double malusLineup10) {
		this.malus_lineup_10 = malusLineup10;
	}
	public double getMalusLineup11() {
		return malus_lineup_11;
	}
	public void setMalusLineup11(double malusLineup11) {
		this.malus_lineup_11 = malusLineup11;
	}
	public double getMalusBench1() {
		return malus_bench_1;
	}
	public void setMalusBench1(double malusBench1) {
		this.malus_bench_1 = malusBench1;
	}
	public double getMalusBench2() {
		return malus_bench_2;
	}
	public void setMalusBench2(double malusBench2) {
		this.malus_bench_2 = malusBench2;
	}
	public double getMalusBench3() {
		return malus_bench_3;
	}
	public void setMalusBench3(double malusBench3) {
		this.malus_bench_3 = malusBench3;
	}
	public double getMalusBench4() {
		return malus_bench_4;
	}
	public void setMalusBench4(double malusBench4) {
		this.malus_bench_4 = malusBench4;
	}
	public double getMalusBench5() {
		return malus_bench_5;
	}
	public void setMalusBench5(double malusBench5) {
		this.malus_bench_5 = malusBench5;
	}
	public double getMalusBench6() {
		return malus_bench_6;
	}
	public void setMalusBench6(double malusBench6) {
		this.malus_bench_6 = malusBench6;
	}
	public double getMalusBench7() {
		return malus_bench_7;
	}
	public void setMalusBench7(double malusBench7) {
		this.malus_bench_7 = malusBench7;
	}
	public String getFirstSubOut() {
		return first_sub_out;
	}
	public void setFirstSubOut(String firstSubOut) {
		this.first_sub_out = firstSubOut;
	}
	public String getFirstSubIn() {
		return first_sub_in;
	}
	public void setFirstSubIn(String firstSubIn) {
		this.first_sub_in = firstSubIn;
	}
	public String getSecondSubOut() {
		return second_sub_out;
	}
	public void setSecondSubOut(String secondSubOut) {
		this.second_sub_out = secondSubOut;
	}
	public String getSecondSubIn() {
		return second_sub_in;
	}
	public void setSecondSubIn(String secondSubIn) {
		this.second_sub_in = secondSubIn;
	}
	public String getThirdSubOut() {
		return third_sub_out;
	}
	public void setThirdSubOut(String thirdSubOut) {
		this.third_sub_out = thirdSubOut;
	}
	public String getThirdSubIn() {
		return third_sub_in;
	}
	public void setThirdSubIn(String thirdSubIn) {
		this.third_sub_in = thirdSubIn;
	}
	public double getTotalPoints() {
		return total_points;
	}
	public void setTotalPoints(double totalPoints) {
		this.total_points = totalPoints;
	}
	public double getTotalPointsWeekly() {
		return total_points_weekly;
	}
	public void setTotalPointsWeekly(double totalPointsWeekly) {
		this.total_points_weekly = totalPointsWeekly;
	}
	public int getTotalTeamPosition() {
		return total_team_position;
	}
	public void setTotalTeamPosition(int totalTeamPosition) {
		this.total_team_position = totalTeamPosition;
	}
	public int getWeeklyTeamPosition() {
		return weekly_team_position;
	}
	public void setWeeklyTeamPosition(int weeklyTeamPosition) {
		this.weekly_team_position = weeklyTeamPosition;
	}
	public int getTotalTeamPositionPrevious() {
		return total_team_position_previous;
	}
	public void setTotalTeamPositionPrevious(int totalTeamPositionPrevious) {
		total_team_position_previous = totalTeamPositionPrevious;
	}
	public int getWeeklyTeamPositionPrevious() {
		return weekly_team_position_previous;
	}
	public void setWeeklyTeamPositionPrevious(int weeklyTeamPositionPrevious) {
		weekly_team_position_previous = weeklyTeamPositionPrevious;
	}
	public int getDeltaTotalPosition() {
		return delta_total_position;
	}
	public void setDeltaTotalPosition(int deltaTotalPosition) {
		this.delta_total_position = deltaTotalPosition;
	}
	public int getDeltaWeeklyPosition() {
		return delta_weekly_position;
	}
	public void setDeltaWeeklyPosition(int deltaWeeklyPosition) {
		this.delta_weekly_position = deltaWeeklyPosition;
	}
	public int getTotalGoal() {
		return total_goal;
	}
	public void setTotalGoal(int totalGoal) {
		this.total_goal = totalGoal;
	}
	public int getTotalPenaltySaved() {
		return total_penalty_saved;
	}
	public void setTotalPenaltySaved(int totalPenaltySaved) {
		this.total_penalty_saved = totalPenaltySaved;
	}
	public int getTotalAssist() {
		return total_assist;
	}
	public void setTotalAssist(int totalAssist) {
		this.total_assist = totalAssist;
	}
	public int getTotalMVPPlayer() {
		return total_mvp_player;
	}
	public void setTotalMVPPlayer(int totalMVPPlayer) {
		this.total_mvp_player = totalMVPPlayer;
	}
	public int getTotalRedCard() {
		return total_red_card;
	}
	public void setTotalRedCard(int totalRedCard) {
		this.total_red_card = totalRedCard;
	}
	public int getTotalYellowCard() {
		return total_yellow_card;
	}
	public void setTotalYellowCard(int totalYellowCard) {
		this.total_yellow_card = totalYellowCard;
	}
	public int getTotalGoalConceded() {
		return total_goal_conceded;
	}
	public void setTotalGoalConceded(int totalGoalConceded) {
		this.total_goal_conceded = totalGoalConceded;
	}
	public int getTotalPenaltyMissed() {
		return total_penalty_missed;
	}
	public void setTotalPenaltyMissed(int totalPenaltyMissed) {
		this.total_penalty_missed = totalPenaltyMissed;
	}
	public int getTotalOwnGoal() {
		return total_own_goal;
	}
	public void setTotalOwnGoal(int totalOwnGoal) {
		this.total_own_goal = totalOwnGoal;
	}
	public String getBestPlayer1() {
		return best_player_1;
	}
	public void setBestPlayer1(String bestPlayer1) {
		this.best_player_1 = bestPlayer1;
	}
	public String getBestPlayer2() {
		return best_player_2;
	}
	public void setBestPlayer2(String bestPlayer2) {
		this.best_player_2 = bestPlayer2;
	}
	public String getWorsePlayer1() {
		return worse_player_1;
	}
	public void setWorsePlayer1(String worsePlayer1) {
		this.worse_player_1 = worsePlayer1;
	}
	public String getWorsePlayer2() {
		return worse_player_2;
	}
	public void setWorsePlayer2(String worsePlayer2) {
		this.worse_player_2 = worsePlayer2;
	}
	public int getBestPlayer1Gol() {
		return best_player_1_gol;
	}
	public void setBestPlayer1Gol(int bestPlayer1Gol) {
		this.best_player_1_gol = bestPlayer1Gol;
	}
	public int getBestPlayer1PenaltySaved() {
		return best_player_1_penalty_saved;
	}
	public void setBestPlayer1PenaltySaved(int bestPlayer1PenaltySaved) {
		this.best_player_1_penalty_saved = bestPlayer1PenaltySaved;
	}
	public String getBestPlayer1MVP() {
		return best_player_1_mvp;
	}
	public void setBestPlayer1MVP(String bestPlayer1MVP) {
		this.best_player_1_mvp = bestPlayer1MVP;
	}
	public int getBestPlayer1Assist() {
		return best_player_1_assist;
	}
	public void setBestPlayer1Assist(int bestPlayer1Assist) {
		this.best_player_1_assist = bestPlayer1Assist;
	}
	public int getBestPlayer2Gol() {
		return best_player_2_gol;
	}
	public void setBestPlayer2Gol(int bestPlayer2Gol) {
		this.best_player_2_gol = bestPlayer2Gol;
	}
	public int getBestPlayer2PenaltySaved() {
		return best_player_2_penalty_saved;
	}
	public void setBestPlayer2PenaltySaved(int bestPlayer2PenaltySaved) {
		this.best_player_2_penalty_saved = bestPlayer2PenaltySaved;
	}
	public String getBestPlayer2MVP() {
		return best_player_2_mvp;
	}
	public void setBestPlayer2MVP(String bestPlayer2MVP) {
		this.best_player_2_mvp = bestPlayer2MVP;
	}
	public int getBestPlayer2Assist() {
		return best_player_2_assist;
	}
	public void setBestPlayer2Assist(int bestPlayer2Assist) {
		this.best_player_2_assist = bestPlayer2Assist;
	}
	public int getWorsePlayer1Owngoal() {
		return worse_player_1_owngoal;
	}
	public void setWorsePlayer1Owngoal(int worsePlayer1Owngoal) {
		this.worse_player_1_owngoal = worsePlayer1Owngoal;
	}
	public int getWorsePlayer1Penalty_missed() {
		return worse_player_1_penalty_missed;
	}
	public void setWorsePlayer1Penalty_missed(int worsePlayer1Penalty_missed) {
		this.worse_player_1_penalty_missed = worsePlayer1Penalty_missed;
	}
	public int getWorsePlayer1GoalConceded() {
		return worse_player_1_goal_conceded;
	}
	public void setWorsePlayer1GoalConceded(int worsePlayer1GoalConceded) {
		this.worse_player_1_goal_conceded = worsePlayer1GoalConceded;
	}
	public int getWorsePlayer1YellowCard() {
		return worse_player_1_yellow_card;
	}
	public void setWorsePlayer1YellowCard(int worsePlayer1YellowCard) {
		this.worse_player_1_yellow_card = worsePlayer1YellowCard;
	}
	public int getWorsePlayer1RedCard() {
		return worse_player_1_red_card;
	}
	public void setWorsePlayer1RedCard(int worsePlayer1RedCard) {
		this.worse_player_1_red_card = worsePlayer1RedCard;
	}
	public int getWorsePlayer2Owngoal() {
		return worse_player_2_owngoal;
	}
	public void setWorsePlayer2Owngoal(int worsePlayer2Owngoal) {
		this.worse_player_2_owngoal = worsePlayer2Owngoal;
	}
	public int getWorsePlayer2PenaltyMissed() {
		return worse_player_2_penalty_missed;
	}
	public void setWorsePlayer2PenaltyMissed(int worsePlayer2PenaltyMissed) {
		this.worse_player_2_penalty_missed = worsePlayer2PenaltyMissed;
	}
	public int getWorsePlayer2GoalConceded() {
		return worse_player_2_goal_conceded;
	}
	public void setWorsePlayer2GoalConceded(int worsePlayer2GoalConceded) {
		this.worse_player_2_goal_conceded = worsePlayer2GoalConceded;
	}
	public int getWorsePlayer2YellowCard() {
		return worse_player_2_yellow_card;
	}
	public void setWorsePlayer2YellowCard(int worsePlayer2YellowCard) {
		this.worse_player_2_yellow_card = worsePlayer2YellowCard;
	}
	public int getWorsePlayer2RedCard() {
		return worse_player_2_red_card;
	}
	public void setWorsePlayer2RedCard(int worsePlayer2RedCard) {
		this.worse_player_2_red_card = worsePlayer2RedCard;
	}
	public int getPriceLineup1() {
		return price_lineup_1;
	}
	public void setPriceLineup1(int priceLineup1) {
		this.price_lineup_1 = priceLineup1;
	}
	public int getPriceLineup2() {
		return price_lineup_2;
	}
	public void setPriceLineup2(int priceLineup2) {
		this.price_lineup_2 = priceLineup2;
	}
	public int getPriceLineup3() {
		return price_lineup_3;
	}
	public void setPriceLineup3(int priceLineup3) {
		this.price_lineup_3 = priceLineup3;
	}
	public int getPriceLineup4() {
		return price_lineup_4;
	}
	public void setPriceLineup4(int priceLineup4) {
		this.price_lineup_4 = priceLineup4;
	}
	public int getPriceLineup5() {
		return price_lineup_5;
	}
	public void setPriceLineup5(int priceLineup5) {
		this.price_lineup_5 = priceLineup5;
	}
	public int getPriceLineup6() {
		return price_lineup_6;
	}
	public void setPriceLineup6(int priceLineup6) {
		this.price_lineup_6 = priceLineup6;
	}
	public int getPriceLineup7() {
		return price_lineup_7;
	}
	public void setPriceLineup7(int priceLineup7) {
		this.price_lineup_7 = priceLineup7;
	}
	public int getPriceLineup8() {
		return price_lineup_8;
	}
	public void setPriceLineup8(int priceLineup8) {
		this.price_lineup_8 = priceLineup8;
	}
	public int getPriceLineup9() {
		return price_lineup_9;
	}
	public void setPriceLineup9(int priceLineup9) {
		this.price_lineup_9 = priceLineup9;
	}
	public int getPriceLineup10() {
		return price_lineup_10;
	}
	public void setPriceLineup10(int priceLineup10) {
		this.price_lineup_10 = priceLineup10;
	}
	public int getPriceLineup11() {
		return price_lineup_11;
	}
	public void setPriceLineup11(int priceLineup11) {
		this.price_lineup_11 = priceLineup11;
	}
	public int getPriceBench1() {
		return price_bench_1;
	}
	public void setPriceBench1(int priceBench1) {
		this.price_bench_1 = priceBench1;
	}
	public int getPriceBench2() {
		return price_bench_2;
	}
	public void setPriceBench2(int priceBench2) {
		this.price_bench_2 = priceBench2;
	}
	public int getPriceBench3() {
		return price_bench_3;
	}
	public void setPriceBench3(int priceBench3) {
		this.price_bench_3 = priceBench3;
	}
	public int getPriceBench4() {
		return price_bench_4;
	}
	public void setPriceBench4(int priceBench4) {
		this.price_bench_4 = priceBench4;
	}
	public int getPriceBench5() {
		return price_bench_5;
	}
	public void setPriceBench5(int priceBench5) {
		this.price_bench_5 = priceBench5;
	}
	public int getPriceBench6() {
		return price_bench_6;
	}
	public void setPriceBench6(int priceBench6) {
		this.price_bench_6 = priceBench6;
	}
	public int getPriceBench7() {
		return price_bench_7;
	}
	public void setPriceBench7(int priceBench7) {
		this.price_bench_7 = priceBench7;
	}
	public int getPriceLineup1previous() {
		return price_lineup_1_previous;
	}
	public void setPriceLineup1previous(int priceLineup1previous) {
		this.price_lineup_1_previous = priceLineup1previous;
	}
	public int getPriceLineup2previous() {
		return price_lineup_2_previous;
	}
	public void setPriceLineup2previous(int priceLineup2previous) {
		this.price_lineup_2_previous = priceLineup2previous;
	}
	public int getPriceLineup3previous() {
		return price_lineup_3_previous;
	}
	public void setPriceLineup3previous(int priceLineup3previous) {
		this.price_lineup_3_previous = priceLineup3previous;
	}
	public int getPriceLineup4previous() {
		return price_lineup_4_previous;
	}
	public void setPriceLineup4previous(int priceLineup4previous) {
		this.price_lineup_4_previous = priceLineup4previous;
	}
	public int getPriceLineup5previous() {
		return price_lineup_5_previous;
	}
	public void setPriceLineup5previous(int priceLineup5previous) {
		this.price_lineup_5_previous = priceLineup5previous;
	}
	public int getPriceLineup6previous() {
		return price_lineup_6_previous;
	}
	public void setPriceLineup6previous(int priceLineup6previous) {
		this.price_lineup_6_previous = priceLineup6previous;
	}
	public int getPriceLineup7previous() {
		return price_lineup_7_previous;
	}
	public void setPriceLineup7previous(int priceLineup7previous) {
		this.price_lineup_7_previous = priceLineup7previous;
	}
	public int getPriceLineup8previous() {
		return price_lineup_8_previous;
	}
	public void setPriceLineup8previous(int priceLineup8previous) {
		this.price_lineup_8_previous = priceLineup8previous;
	}
	public int getPriceLineup9previous() {
		return price_lineup_9_previous;
	}
	public void setPriceLineup9previous(int priceLineup9previous) {
		this.price_lineup_9_previous = priceLineup9previous;
	}
	public int getPriceLineup10previous() {
		return price_lineup_10_previous;
	}
	public void setPriceLineup10previous(int priceLineup10previous) {
		this.price_lineup_10_previous = priceLineup10previous;
	}
	public int getPriceLineup11previous() {
		return price_lineup_11_previous;
	}
	public void setPriceLineup11previous(int priceLineup11previous) {
		this.price_lineup_11_previous = priceLineup11previous;
	}
	public int getPriceBench1previous() {
		return price_bench_1_previous;
	}
	public void setPriceBench1previous(int priceBench1previous) {
		this.price_bench_1_previous = priceBench1previous;
	}
	public int getPriceBench2previous() {
		return price_bench_2_previous;
	}
	public void setPriceBench2previous(int priceBench2previous) {
		this.price_bench_2_previous = priceBench2previous;
	}
	public int getPriceBench3previous() {
		return price_bench_3_previous;
	}
	public void setPriceBench3previous(int priceBench3previous) {
		this.price_bench_3_previous = priceBench3previous;
	}
	public int getPriceBench4previous() {
		return price_bench_4_previous;
	}
	public void setPriceBench4previous(int priceBench4previous) {
		this.price_bench_4_previous = priceBench4previous;
	}
	public int getPriceBench5previous() {
		return price_bench_5_previous;
	}
	public void setPriceBench5previous(int priceBench5previous) {
		this.price_bench_5_previous = priceBench5previous;
	}
	public int getPriceBench6previous() {
		return price_bench_6_previous;
	}
	public void setPriceBench6previous(int priceBench6previous) {
		this.price_bench_6_previous = priceBench6previous;
	}
	public int getPriceBench7previous() {
		return price_bench_7_previous;
	}
	public void setPriceBench7previous(int priceBench7previous) {
		this.price_bench_7_previous = priceBench7previous;
	}
	public int getDeltaPriceLineup1previous() {
		return delta_price_lineup_1;
	}
	public void setDeltaPriceLineup1previous(int deltaPriceLineup1previous) {
		this.delta_price_lineup_1 = deltaPriceLineup1previous;
	}
	public int getDeltaPriceLineup2previous() {
		return delta_price_lineup_2;
	}
	public void setDeltaPriceLineup2previous(int deltaPriceLineup2previous) {
		this.delta_price_lineup_2 = deltaPriceLineup2previous;
	}
	public int getDeltaPriceLineup3previous() {
		return delta_price_lineup_3;
	}
	public void setDeltaPriceLineup3previous(int deltaPriceLineup3previous) {
		this.delta_price_lineup_3 = deltaPriceLineup3previous;
	}
	public int getDeltaPriceLineup4previous() {
		return delta_price_lineup_4;
	}
	public void setDeltaPriceLineup4previous(int deltaPriceLineup4previous) {
		this.delta_price_lineup_4 = deltaPriceLineup4previous;
	}
	public int getDeltaPriceLineup5previous() {
		return delta_price_lineup_5;
	}
	public void setDeltaPriceLineup5previous(int deltaPriceLineup5previous) {
		this.delta_price_lineup_5 = deltaPriceLineup5previous;
	}
	public int getDeltaPriceLineup6previous() {
		return delta_price_lineup_6;
	}
	public void setDeltaPriceLineup6previous(int deltaPriceLineup6previous) {
		this.delta_price_lineup_6 = deltaPriceLineup6previous;
	}
	public int getDeltaPriceLineup7previous() {
		return delta_price_lineup_7;
	}
	public void setDeltaPriceLineup7previous(int deltaPriceLineup7previous) {
		this.delta_price_lineup_7 = deltaPriceLineup7previous;
	}
	public int getDeltaPriceLineup8previous() {
		return delta_price_lineup_8;
	}
	public void setDeltaPriceLineup8previous(int deltaPriceLineup8previous) {
		this.delta_price_lineup_8 = deltaPriceLineup8previous;
	}
	public int getDeltaPriceLineup9previous() {
		return delta_price_lineup_9;
	}
	public void setDeltaPriceLineup9previous(int deltaPriceLineup9previous) {
		this.delta_price_lineup_9 = deltaPriceLineup9previous;
	}
	public int getDeltaPriceLineup10previous() {
		return delta_price_lineup_10;
	}
	public void setDeltaPriceLineup10previous(int deltaPriceLineup10previous) {
		this.delta_price_lineup_10 = deltaPriceLineup10previous;
	}
	public int getDeltaPriceLineup11previous() {
		return delta_price_lineup_11;
	}
	public void setDeltaPriceLineup11previous(int deltaPriceLineup11previous) {
		this.delta_price_lineup_11 = deltaPriceLineup11previous;
	}
	public int getDeltaPriceBench1previous() {
		return delta_price_bench_1;
	}
	public void setDeltaPriceBench1previous(int deltaPriceBench1previous) {
		this.delta_price_bench_1 = deltaPriceBench1previous;
	}
	public int getDeltaPriceBench2previous() {
		return delta_price_bench_2;
	}
	public void setDeltaPriceBench2previous(int deltaPriceBench2previous) {
		this.delta_price_bench_2 = deltaPriceBench2previous;
	}
	public int getDeltaPriceBench3previous() {
		return delta_price_bench_3;
	}
	public void setDeltaPriceBench3previous(int deltaPriceBench3previous) {
		this.delta_price_bench_3 = deltaPriceBench3previous;
	}
	public int getDeltaPriceBench4previous() {
		return delta_price_bench_4;
	}
	public void setDeltaPriceBench4previous(int deltaPriceBench4previous) {
		this.delta_price_bench_4 = deltaPriceBench4previous;
	}
	public int getDeltaPriceBench5previous() {
		return delta_price_bench_5;
	}
	public void setDeltaPriceBench5previous(int deltaPriceBench5previous) {
		this.delta_price_bench_5 = deltaPriceBench5previous;
	}
	public int getDeltaPriceBench6previous() {
		return delta_price_bench_6;
	}
	public void setDeltaPriceBench6previous(int deltaPriceBench6previous) {
		this.delta_price_bench_6 = deltaPriceBench6previous;
	}
	public int getDeltaPriceBench7previous() {
		return delta_price_bench_7;
	}
	public void setDeltaPriceBench7previous(int deltaPriceBench7previous) {
		this.delta_price_bench_7 = deltaPriceBench7previous;
	}
	public int getWorse_player_1_points() {
		return worse_player_1_points;
	}
	public void setWorse_player_1_points(int worse_player_1_points) {
		this.worse_player_1_points = worse_player_1_points;
	}
	public int getWorse_player_2_points() {
		return worse_player_2_points;
	}
	public void setWorse_player_2_points(int worse_player_2_points) {
		this.worse_player_2_points = worse_player_2_points;
	}
	public int getBest_player_1_poitns() {
		return best_player_1_poitns;
	}
	public void setBest_player_1_poitns(int best_player_1_poitns) {
		this.best_player_1_poitns = best_player_1_poitns;
	}
	public int getBest_player_2_poitns() {
		return best_player_2_poitns;
	}
	public void setBest_player_2_poitns(int best_player_2_poitns) {
		this.best_player_2_poitns = best_player_2_poitns;
	}
	public Date getUpload_Date() {
		return upload_date;
	}
	public void setUpload_date(Date uploadDate) {
		this.upload_date = uploadDate;
	}
}

