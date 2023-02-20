import java.util.ArrayList;

public class Main{
    public static void main(String[] args)
    {
        Mahasiswa nopal = new Mahasiswa();
        nopal.setNik("32103");
        nopal.setNim("2105673");
        nopal.setNama("nopal");
        nopal.setGender('L');
        nopal.setFakultas("fpmipa");
        nopal.setProdi("ilkom");


        Mahasiswa alga = new Mahasiswa("2103","alga", 'L', "2105674", "fpmipa", "ilkom");

        System.out.println("Data mahasiswa :");
        System.out.println(nopal.getNim() + " | "+ nopal.getNama() + " | " + nopal.getGender() +" | " + nopal.getProdi() + " | " + nopal.getFakultas());
        System.out.println(alga.getNim() + " | "+ alga.getNama() + " | " + alga.getGender() +" | " + alga.getProdi() + " | " + alga.getFakultas());

        Univ naufal = new Univ();
        naufal.setNim("2105673");
        naufal.setProdi("ilkom");
        naufal.setFakultas("fpmipa");
        naufal.setKampus("UPI");
        naufal.setEmail("algha_naufal@upi.edu");

        Univ algha = new Univ("2105674", "ilkom", "fpmipa", "UPI", "naufal_algha@upi.edu");

        System.out.println("Data email :");
        System.out.println(naufal.getNim() + " | " + naufal.getKampus() + " | " + naufal.getEmail());
        System.out.println(algha.getNim() + " | " + algha.getKampus() + " | " + algha.getEmail());
    }
}