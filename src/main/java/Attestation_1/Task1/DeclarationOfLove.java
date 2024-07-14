package Attestation_1.Task1;

public class DeclarationOfLove {
    private final float fenceLength;

    public DeclarationOfLove(float fenceLength) {
        this.fenceLength = fenceLength;
    }

    public void isWillSeeItOrNot() {
        if (fenceLength < ((15 / 3) * 62 + 3 * 12)) {
            System.out.println("Длина забора: " + fenceLength + " слишком мала, Ваша надпись не поместится :( !");
        } else {
            System.out.println("Длина забора: " + fenceLength + " достаточна, Пишите смело!");
        }
    }
}
