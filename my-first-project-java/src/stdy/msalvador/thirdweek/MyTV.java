package stdy.msalvador.thirdweek;
public class MyTV {
    /*Exemplo aplicado "Interação com uma TV" */
    boolean onOff = false;
    int volume = 1;
    int channels = 1;

    public void ligar(){
        onOff = true;
        System.out.println("TV LIGADA");
    }
    public void desligar(){
        onOff = false;
        System.out.println("TV DESLIGADA");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("AUMENTANDO VOLUME");

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("DIMINUINDO VOLUME");
    }
    public void aumentarCanal(){
        channels++;
        System.out.println("AUMENTANDO CANAL");
    }
    public void diminuirCanal(){
        channels--;
        System.out.println("DIMINUINDO CANAL");
    }

    public void mostrarStatus(){
        System.out.println("\nESTADO ATUAL DA TV: \n");
        System.out.println("TV Ligada ? " + onOff);
        System.out.println("CANAL Atual: " + channels);
        System.out.println("VOLUME Atual: " + volume);
    }

}

