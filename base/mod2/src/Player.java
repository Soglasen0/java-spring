import java.util.Random;

public class Player {
    private String playerName;
    private VARIANTS variants;

    public Player(){
        Random rand = new Random();
        playerName = "Bot";
        variants = VARIANTS.values()[rand.nextInt(VARIANTS.values().length)];
    }

    public Player(VARIANTS variants, String playerName) {
        this.variants = variants;
        this.playerName = playerName;
    }

    public String whoWins(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.variants == secondPlayer.variants)
            return "Ничья";

        switch(firstPlayer.variants){
            case ROCK:
                if(secondPlayer.variants == VARIANTS.SCISSORS) return "Победил игрок с именем: " + firstPlayer.playerName;
                break;
            case SCISSORS:
                if(secondPlayer.variants == VARIANTS.PAPER) return "Победил игрок с именем: " + firstPlayer.playerName;
                break;
            case PAPER:
                if(secondPlayer.variants == VARIANTS.ROCK) return "Победил игрок с именем: " + firstPlayer.playerName;
                break;
        }
        return "Победил игрок с именем: " + secondPlayer.playerName;
    }
}
