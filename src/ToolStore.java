public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean OnLocation() {
        System.out.println("----- Mağazaya hoşgeldiniz.----- ");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış yap.");
        System.out.print("Seçiminiz: ");
        int selectCase = scanner.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.print("Geçersiz bir değer girdiniz. Tekrar girin.");
            selectCase = scanner.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            default:
            case 3:
                System.out.println("Tekrar bekleriz.");
                return true;
        }
        return true;
    }

    private void printArmor() {
        System.out.println("Zırhlar");
    }

    public void printWeapon() {
        System.out.println("Silahlar");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + " - " + weapon.getName() + " Para :" + weapon.getPrice() + " Hasar : " + weapon.getDamage());
        }
        System.out.println("Bir silah seçiniz. ");
        int selectWeapon = scanner.nextInt();
        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
            System.out.print("Geçersiz değer, tekrar giriniz :");
            selectWeapon = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeapon);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır.");
            } else {
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
            }
        }
    }
}
