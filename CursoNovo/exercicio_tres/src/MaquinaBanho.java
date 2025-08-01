public class MaquinaBanho {

    private boolean clean = true;
    private int agua = 30;
    private int shampoo = 10;
    private Pet pet = null;

    public void tomarBanho() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para o banho.");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }

    public void addAgua() {
        if (agua == 30) {
            System.out.println("Limite de água da máquina atingido.");
            return;
        }

        agua += 2;
    }

    public void addShampo() {
        if (shampoo == 10) {
            System.out.println("Limite de shampoo da máquina atingido.");
            return;
        }
        shampoo += 2;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Limpe antes de colocar o pet.");
            return;
        }

        if (temPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina.");
        }
    }

    public void retirarPet() {
        if (!this.pet.isClean()) {
            System.out.println("O pet " + this.pet.getName() + " não está limpo.");
        } else {
            System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
            this.pet = null;
        }
    }

    public void limparMaquina() {
        this.agua -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }

}
