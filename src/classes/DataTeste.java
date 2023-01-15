package classes;

public class DataTeste {
    public static void main(String[] args) {

        Data myDate2 = new Data();
        System.out.println(myDate2.obterDataFormatada());

        Data myDate = new Data(31,12,2020);
        System.out.println(myDate.obterDataFormatada());

    }

}
