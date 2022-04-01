import java.util.ArrayList;
import java.util.List;

public class Notebook {
   Proccessors proccessor;
   VideoCards videoCard;
   Memory memory;
   ArrayList<Complectation>complectations  = new ArrayList<>(List.of(new Complectation(Proccessors.i1, VideoCards.rtx1050,Memory.gb300),new Complectation(Proccessors.i1, VideoCards.rtx1050,Memory.gb100),new Complectation(Proccessors.i2, VideoCards.rtx2050,Memory.gb200),new Complectation(Proccessors.i4, VideoCards.rtx3050,Memory.gb300) ));//{new Complectation(Proccessors.i1, VideoCards.rtx1050,Memory.gb100)}.to;
    public Notebook(Proccessors proccessor,  VideoCards videoCard, Memory memory) {
        Complectation best_complectation = null;
        int best_percentage = 0;
        for (Complectation defaultComplectation:complectations) {
                if (compareCoplectaionsPercentage(proccessor,videoCard,memory,defaultComplectation)>=best_percentage){
                    best_percentage = compareCoplectaionsPercentage(proccessor,videoCard,memory,defaultComplectation);
                    best_complectation = defaultComplectation;
                }
        }
        setComplectation(best_complectation);
    }
    private int compareCoplectaionsPercentage(Proccessors proccessor,VideoCards videoCard, Memory memory, Complectation complectation){
        int percentage_of_comparasion = 0;
        percentage_of_comparasion += (proccessor == complectation.getProccessor())?33:0;
        percentage_of_comparasion += (memory == complectation.getMemory())?33:0;
        percentage_of_comparasion += (videoCard == complectation.getVideoCard())?33:0;
        return percentage_of_comparasion;
    }
    private void setComplectation(Complectation complectation){
        this.proccessor = complectation.getProccessor();
        this.memory = complectation.getMemory();
        this.videoCard = complectation.getVideoCard();
    }
}
class Complectation{
    private Proccessors proccessor;
    private VideoCards videoCard;
    private Memory memory;


    public Complectation(Proccessors proccessor, VideoCards videoCard, Memory memory) {
        this.proccessor = proccessor;
        this.videoCard = videoCard;
        this.memory = memory;
    }
    public Proccessors getProccessor() {
        return proccessor;
    }

    public VideoCards getVideoCard() {
        return videoCard;
    }

    public Memory getMemory() {
        return memory;
    }


}

enum  Proccessors{
    i1,i2,i3,i4,i5,i6
}
enum  VideoCards{
    rtx1050,rtx1650,rtx2050,rtx3050
}
enum Memory{
    gb100,gb200,gb300,gb400
}
