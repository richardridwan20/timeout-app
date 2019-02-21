package com.example.bn000976322.timeout;

import java.util.ArrayList;

public class TeamsData {
    public static int[][] data = new int[][]{
            {R.drawable.atlanta_hawks, R.string.atlanta_hawks, R.string.atlanta_date, R.string.lloyd_pierce, R.string.atlanta_stadium,R.string.atlanta_history, R.drawable.atlanta_1, R.drawable.atlanta_2, R.drawable.atlanta_3, R.drawable.atlanta_4, R.drawable.atlanta_5},
            {R.drawable.boston_celtics, R.string.boston_celtics,R.string.boston_date,R.string.boston_coach,R.string.boston_stadium,R.string.boston_history, R.drawable.boston_1, R.drawable.boston_2, R.drawable.boston_3, R.drawable.boston_4, R.drawable.boston_5},
            {R.drawable.brooklyn_nets, R.string.brooklyn_nets,R.string.nets_date,R.string.nets_coach,R.string.nets_stadium, R.string.brooklyn_history, R.drawable.brooklyn_1, R.drawable.brooklyn_2, R.drawable.brooklyn_3, R.drawable.brooklyn_4, R.drawable.brooklyn_5},
            {R.drawable.charlotte_hornets, R.string.charlotte_hornets,R.string.hornets_date,R.string.hornets_coach,R.string.hornets_stadium, R.string.charlotte_history, R.drawable.charlotte_1, R.drawable.charlotte_2, R.drawable.charlotte_3, R.drawable.charlotte_4, R.drawable.charlotte_5},
            {R.drawable.chicago_bulls, R.string.chicago_bulls,R.string.bulls_date,R.string.bulls_coach,R.string.bulls_stadium, R.string.chicago_history, R.drawable.chicago_1, R.drawable.chicago_2, R.drawable.chicago_3, R.drawable.chicago_4, R.drawable.chicago_5},
            {R.drawable.cleveland_cavaliers, R.string.cleveland_cavaliers,R.string.cavs_date,R.string.cavs_coach,R.string.cavs_stadium, R.string.cleveland_history, R.drawable.cleveland_1, R.drawable.cleveland_2, R.drawable.cleveland_3, R.drawable.cleveland_4, R.drawable.cleveland_5},
            {R.drawable.dallas_mavericks, R.string.dallas_mavericks,R.string.mavs_date,R.string.mavs_coach,R.string.mavs_stadium, R.string.dallas_history, R.drawable.dallas_1, R.drawable.dallas_2, R.drawable.dallas_3, R.drawable.dallas_4, R.drawable.dallas_5},
            {R.drawable.denver_nuggets, R.string.denver_nuggets,R.string.nuggets_date,R.string.nuggets_coach,R.string.nuggets_stadium, R.string.denver_history, R.drawable.denver_1, R.drawable.denver_2, R.drawable.denver_3, R.drawable.denver_4, R.drawable.denver_5},
            {R.drawable.detroit_pistons, R.string.detroit_pistons,R.string.pistons_date,R.string.pistons_coach,R.string.pistons_stadium, R.string.detroit_history, R.drawable.detroit_1, R.drawable.detroit_2, R.drawable.detroit_3, R.drawable.detroit_4, R.drawable.detroit_5},
            {R.drawable.goldenstate_warriors, R.string.goldenstate_warriors,R.string.warriors_date,R.string.warriors_coach,R.string.warriors_stadium, R.string.goldenstate_history, R.drawable.goldenstate_1, R.drawable.goldenstate_2, R.drawable.goldenstate_3, R.drawable.goldenstate_4, R.drawable.goldenstate_5},
            {R.drawable.houston_rockets, R.string.houston_rockets,R.string.rockets_date,R.string.rockets_coach,R.string.rockets_stadium, R.string.houston_history, R.drawable.houston_1, R.drawable.houston_2, R.drawable.houston_3, R.drawable.houston_4, R.drawable.houston_5},
            {R.drawable.indiana_pacers, R.string.indiana_pacers,R.string.pacers_date,R.string.pacers_coach,R.string.pacers_stadium, R.string.indiana_history, R.drawable.indiana_1, R.drawable.indiana_2, R.drawable.indiana_3, R.drawable.indiana_4, R.drawable.indiana_5},
            {R.drawable.losangeles_clippers, R.string.losangeles_clippers,R.string.clippers_date,R.string.clippers_coach,R.string.clippers_stadium, R.string.clippers_history, R.drawable.clippers_1, R.drawable.clippers_2, R.drawable.clippers_3, R.drawable.clippers_4, R.drawable.clippers_5},
            {R.drawable.losangeles_lakers, R.string.losangeles_lakers,R.string.lakers_date,R.string.lakers_coach,R.string.lakers_stadium, R.string.lakers_history, R.drawable.lakers_1, R.drawable.lakers_2, R.drawable.lakers_3, R.drawable.lakers_4, R.drawable.lakers_5},
            {R.drawable.memphis_grizzlies, R.string.memphis_grizzlies,R.string.memphis_date,R.string.memphis_coach,R.string.memphis_stadium, R.string.memphis_history, R.drawable.memphis_1, R.drawable.memphis_2, R.drawable.memphis_3, R.drawable.memphis_4, R.drawable.memphis_5},
            {R.drawable.miami_heat, R.string.miami_heat,R.string.heat_date,R.string.heat_coach,R.string.heat_stadium, R.string.miami_history, R.drawable.miami_1, R.drawable.miami_2, R.drawable.miami_3, R.drawable.miami_4, R.drawable.miami_5},
            {R.drawable.milwaukee_bucks, R.string.milwaukee_bucks,R.string.bucks_date,R.string.bucks_coach,R.string.bucks_stadium, R.string.milwaukee_history, R.drawable.milwaukee_1, R.drawable.milwaukee_2, R.drawable.milwaukee_3, R.drawable.milwaukee_4, R.drawable.milwaukee_5},
            {R.drawable.minnesota_timberwolves, R.string.minnesota_timberwolves,R.string.timberwolves_date,R.string.timberwolves_coach,R.string.timberwolves_stadium, R.string.minnesota_history , R.drawable.minnesota_1, R.drawable.minnesota_2, R.drawable.minnesota_3, R.drawable.minnesota_4, R.drawable.minnesota_5},
            {R.drawable.neworleans_pelicans, R.string.neworleans_pelicans,R.string.pelicans_date,R.string.pelicans_coach,R.string.pelicans_stadium, R.string.neworleans_history, R.drawable.neworleans_1, R.drawable.neworleans_2, R.drawable.neworleans_3, R.drawable.neworleans_4, R.drawable.neworleans_5},
            {R.drawable.newyork_knicks, R.string.newyork_knicks,R.string.knicks_date,R.string.knicks_coach,R.string.knicks_stadium, R.string.newyork_history, R.drawable.newyork_1, R.drawable.newyork_2, R.drawable.newyork_3, R.drawable.newyork_4, R.drawable.newyork_5},
            {R.drawable.oklahomacity_thunder, R.string.oklahomacity_thunder,R.string.thunder_date,R.string.thunder_coach,R.string.thunder_stadium, R.string.oklahomacity_history, R.drawable.oklahomacity_1, R.drawable.oklahomacity_2, R.drawable.oklahomacity_3, R.drawable.oklahomacity_4, R.drawable.oklahomacity_5},
            {R.drawable.orlando_magic, R.string.orlando_magic,R.string.magic_date,R.string.magic_coach,R.string.magic_stadium, R.string.orlando_history, R.drawable.orlando_1, R.drawable.orlando_2, R.drawable.orlando_3, R.drawable.orlando_4, R.drawable.orlando_5},
            {R.drawable.philadelphia_76ers, R.string.philadelphia_76ers,R.string.sixers_date,R.string.sixers_coach,R.string.sixers_stadium, R.string.philadelphia_history, R.drawable.philadelphia_1, R.drawable.philadelphia_2, R.drawable.philadelphia_3, R.drawable.philadelphia_4, R.drawable.philadelphia_5},
            {R.drawable.phoenix_suns, R.string.phoenix_suns,R.string.suns_date,R.string.suns_coach,R.string.suns_stadium, R.string.phoenix_history, R.drawable.phoenix_1, R.drawable.phoenix_2, R.drawable.phoenix_3, R.drawable.phoenix_4, R.drawable.phoenix_5},
            {R.drawable.portland_trailblazers, R.string.portland_trailblazers,R.string.blazers_date,R.string.blazers_coach,R.string.blazers_stadium, R.string.portland_history, R.drawable.portland_1, R.drawable.portland_2, R.drawable.portland_3, R.drawable.portland_4, R.drawable.portland_5},
            {R.drawable.sacramento_kings, R.string.sacramento_kings,R.string.kings_date,R.string.kings_coach,R.string.kings_stadium, R.string.sacramento_history, R.drawable.sacramento_1, R.drawable.sacramento_2, R.drawable.sacramento_3, R.drawable.sacramento_4, R.drawable.sacramento_5},
            {R.drawable.sanantonio_spurs, R.string.sanantonio_spurs,R.string.spurs_date,R.string.spurs_coach,R.string.spurs_stadium, R.string.sanantonio_history, R.drawable.sanantonio_1, R.drawable.sanantonio_2, R.drawable.sanantonio_3, R.drawable.sanantonio_4, R.drawable.sanantonio_5},
            {R.drawable.toronto_raptors, R.string.toronto_raptors,R.string.raptors_date,R.string.raptors_coach,R.string.raptors_stadium, R.string.toronto_history, R.drawable.toronto_1, R.drawable.toronto_2, R.drawable.toronto_3, R.drawable.toronto_4, R.drawable.toronto_5},
            {R.drawable.utah_jazz, R.string.utah_jazz,R.string.jazz_date,R.string.jazz_coach,R.string.jazz_stadium, R.string.utah_history, R.drawable.utah_1, R.drawable.utah_2, R.drawable.utah_3, R.drawable.utah_4, R.drawable.utah_5},
            {R.drawable.washington_wizards, R.string.washington_wizards,R.string.wizards_date,R.string.wizards_coach,R.string.wizards_stadium, R.string.washington_history, R.drawable.washington_1, R.drawable.washington_2, R.drawable.washington_3, R.drawable.washington_4, R.drawable.washington_5}
    };

    public static int[][] standingsData = new int[][]{
            {R.string.toronto_rank,R.drawable.toronto_raptors, R.string.toronto_name,R.string.toronto_win,R.string.toronto_loss},
            {R.string.milwaukee_rank,R.drawable.milwaukee_bucks, R.string.milwaukee_name,R.string.milwaukee_win,R.string.milwaukee_loss},
            {R.string.memphis_rank,R.drawable.memphis_grizzlies, R.string.memphis_name,R.string.memphis_win,R.string.memphis_loss},
            {R.string.blazzer_rank,R.drawable.portland_trailblazers, R.string.blazzer_name,R.string.blazzer_win,R.string.blazzer_loss},
            {R.string.sixers_rank,R.drawable.philadelphia_76ers, R.string.sixers_name,R.string.sixers_win,R.string.sixers_loss},
            {R.string.clippers_rank,R.drawable.losangeles_clippers, R.string.clippers_name,R.string.clippers_win,R.string.clippers_loss},
            {R.string.thunder_rank,R.drawable.oklahomacity_thunder, R.string.thunder_name,R.string.thunder_win,R.string.thunder_loss},
            {R.string.warriors_rank,R.drawable.goldenstate_warriors, R.string.warriors_name,R.string.warriors_win,R.string.warriors_loss},
            {R.string.nuggets_rank,R.drawable.denver_nuggets, R.string.nuggets_name, R.string.nuggets_win,R.string.nuggets_loss},
            {R.string.pacers_rank,R.drawable.indiana_pacers, R.string.pacers_name,R.string.pacers_win,R.string.pacers_loss},
            {R.string.lakers_rank,R.drawable.losangeles_lakers, R.string.lakers_name,R.string.lakers_win,R.string.lakers_loss},
            {R.string.rockets_rank,R.drawable.houston_rockets, R.string.rockets_name,R.string.rockets_win,R.string.rockets_loss},
            {R.string.pelicans_rank,R.drawable.neworleans_pelicans, R.string.pelicans_name,R.string.pelicans_win,R.string.pelicans_loss},
            {R.string.kings_rank,R.drawable.sacramento_kings, R.string.kings_name,R.string.kings_win,R.string.kings_loss},
            {R.string.pistons_rank,R.drawable.detroit_pistons, R.string.pistons_name,R.string.pistons_win,R.string.pistons_loss},
            {R.string.hornets_rank,R.drawable.charlotte_hornets, R.string.hornets_name,R.string.hornets_win,R.string.hornets_loss},
            {R.string.celtics_rank,R.drawable.boston_celtics, R.string.celtics_name,R.string.celtics_win,R.string.celtics_loss},
            {R.string.magic_rank,R.drawable.orlando_magic, R.string.magic_name,R.string.magic_win,R.string.magic_loss},
            {R.string.mavericks_rank,R.drawable.dallas_mavericks, R.string.mavericks_name,R.string.mavericks_win,R.string.mavericks_loss},
            {R.string.spurs_rank,R.drawable.sanantonio_spurs, R.string.spurs_name,R.string.spurs_win,R.string.spurs_loss},
            {R.string.jazz_rank,R.drawable.utah_jazz, R.string.jazz_name,R.string.jazz_win,R.string.jazz_loss},
            {R.string.nets_rank,R.drawable.brooklyn_nets, R.string.nets_name,R.string.nets_win,R.string.nets_loss},
            {R.string.timberwolves_rank,R.drawable.minnesota_timberwolves, R.string.timberwolves_name,R.string.timberwolves_win,R.string.timberwolves_loss},
            {R.string.heat_rank,R.drawable.miami_heat, R.string.heat_name,R.string.heat_win,R.string.heat_loss},
            {R.string.wizards_rank,R.drawable.washington_wizards, R.string.wizards_name,R.string.wizards_win,R.string.wizards_loss},
            {R.string.bulls_rank,R.drawable.chicago_bulls, R.string.bulls_name,R.string.bulls_win,R.string.bulls_loss},
            {R.string.knicks_rank,R.drawable.newyork_knicks, R.string.knicks_name,R.string.knicks_win,R.string.knicks_loss},
            {R.string.suns_rank,R.drawable.phoenix_suns, R.string.suns_name,R.string.suns_win,R.string.suns_loss},
            {R.string.hawks_rank,R.drawable.atlanta_hawks, R.string.hawks_name,R.string.hawks_win,R.string.hawks_loss},
            {R.string.cavs_rank,R.drawable.cleveland_cavaliers, R.string.cavs_name,R.string.cavs_win,R.string.cavs_loss}
    };

    public static ArrayList<Teams> getTeamsData(){

        Teams teams = null;
        ArrayList<Teams> list = new ArrayList<>();
        for (int i = 0; i<data.length ;  i++){
            teams = new Teams();
            teams.setTeamsImage(data[i][0]);
            teams.setTeamsName(data[i][1]);
            teams.setTeamsFoundedDate(data[i][2]);
            teams.setTeamsHeadCoach(data[i][3]);
            teams.setTeamsStadium(data[i][4]);
            teams.setTeamsHistory(data[i][5]);
            teams.setTeamsPhotoOne(data[i][6]);
            teams.setTeamsPhotoTwo(data[i][7]);
            teams.setTeamsPhotoThree(data[i][8]);
            teams.setTeamsPhotoFour(data[i][9]);
            teams.setTeamsPhotoFive(data[i][10]);

            list.add(teams);
        }

        return list;
    }

    public static ArrayList<Standings> getStandingsData(){
        Standings standings = null;

        ArrayList<Standings> standingsList = new ArrayList<>();
        for (int i = 0; i<standingsData.length ;  i++){
            standings = new Standings();

            standings.setTeamRank(standingsData[i][0]);
            standings.setTeamLogo(standingsData[i][1]);
            standings.setTeamName(standingsData[i][2]);
            standings.setTeamWin(standingsData[i][3]);
            standings.setTeamLoss(standingsData[i][4]);

            standingsList.add(standings);
        }

        return standingsList;
    }
}
