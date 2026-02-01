String bandName ="_:_:_:_ThE CODiNG MONkEYS_:_:_:_";
int fansCount = 8500;
int fansMAx = 15000;
int fameLevel =2;
int experiencePoint = 3200;
double moneyInBank= 4750.50;
boolean workActive = true;
char[] typeMusic ={'R','E','H','P',};
String[] musicType= {"ROCK","ELECTRONIC","HIPHOP","POP",};


String[] songsRepertoire = {"Rock it, and Roll it","Electric boggaloo", "Hey Code","Die, PopPop",};

            String sheetTitle = "===BAND PROFILE===";
            String sheetBand = "Name: ";
            String sheetGenre = "Genre: ";
            String sheetFameLevel = "Fame Level: ";
            String sheetExperience = "XP: ";
            String sheetFans = "Fans:  ";
            String sheetMoney = "Money: ";
            String sheetActive = "True: ";

            String sheetRepertoire = "Repertoire";

            int sheetMusicType = musicType.length;
            int sheetRepertoireSong = songsRepertoire.length;//


void main() {

    System.out.println(sheetTitle);
    System.out.println(sheetBand + bandName);


    System.out.println(sheetGenre + typeMusic[0]);

    System.out.println(sheetFameLevel + fameLevel);

    System.out.println(sheetFans + "(" + fansCount + "/" + fansMAx + ")");

    System.out.println(sheetExperience + experiencePoint);

    System.out.println(sheetMoney + moneyInBank);

    System.out.println(sheetActive + workActive);

    System.out.println(sheetRepertoire + " (" + sheetRepertoireSong + " Songs)");

    System.out.println();
    System.out.println();
    System.out.println();


for(int i=0; i<5; i++) {

    System.out.println("-------------------------------");
    System.out.println(Arrays.toString(musicType[(i%sheetMusicType)].toCharArray()));
    System.out.println();
    System.out.println("Song");

                System.out.println(songsRepertoire[(i % sheetRepertoireSong)]);
                     System.out.println();

}}







