class IPLTeams {

    // Static arrays
    static String iplTeamNames[] = {
        "Chennai Super Kings",
        "Mumbai Indians",
        "Royal Challengers Bangalore",
        "Kolkata Knight Riders",
        "Delhi Capitals",
        "Sunrisers Hyderabad",
        "Rajasthan Royals",
        "Punjab Kings",
        "Lucknow Super Giants",
        "Gujarat Titans"
    };

    public static void main(String[] args){

        String leagueName = "Indian Premier League";
        System.out.println("League Name: " + leagueName);

        getIplTeams();
    }

    // Method to print teams
    static void getIplTeams(){
        System.out.println("List of IPL Teams:");
        for(String team : iplTeamNames){
            System.out.println(team);
        }
    }
}