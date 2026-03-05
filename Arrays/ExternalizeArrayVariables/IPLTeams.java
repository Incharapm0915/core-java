class IPLTeams {
    
    public static void main(String[] args){
        String chennaiSuperKings="Chennai Super Kings";
        String mumbaiIndians="Mumbai Indians";
        String royalChallengersBangalore="Royal Challengers Bangalore";
        String kolkataKnightRiders="Kolkata Knight Riders";
        String delhiCapitals="Delhi Capitals";
        String sunrisersHyderabad="Sunrisers Hyderabad";
        String rajasthanRoyals="Rajasthan Royals";
        String punjabKings="Punjab Kings";
        String lucknowSuperGiants="Lucknow Super Giants";
        String gujaratTitans="Gujarat Titans";

        String iplTeamNames[]={chennaiSuperKings,mumbaiIndians,royalChallengersBangalore,kolkataKnightRiders,delhiCapitals,sunrisersHyderabad,rajasthanRoyals,punjabKings,lucknowSuperGiants,gujaratTitans};

        System.out.println("IPL Teams:");

        for(String team : iplTeamNames){
            System.out.println(team);
        }
    }
}