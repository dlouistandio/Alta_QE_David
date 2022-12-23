public class Main {
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(mean(value));
    }

    private static float mean(float[] number) {
        float totalAngka = 0;
        float rataRata = 0;

        for (float angka : number) {
            totalAngka = totalAngka + angka;
            rataRata = totalAngka / number.length;
        }
        return rataRata;
    }

}