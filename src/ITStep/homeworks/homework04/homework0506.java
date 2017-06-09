package ITStep.homeworks.homework04;

/**
 * Created by roman on 15.09.2016.
 * Ученикам первого класса дают 1 пирожок, если вес первоклассника менее 30 кг
 дополнительно дают 1 стакан молока и еще 1 пирожок. В первых классах школы учится
 n учеников. Стакан молока имеет емкость 200 мл, а упаковки молока – 0,9 л. Написать
 программу которая определит количество пакетов молока и пирожков, необходимых
 каждый день для условий:
 a. Если в школе 100% всех учеников, у которых вес меньше 30 кг.
 b. Если в школе 60% учеников, имеют вес меньше 30 кг.
 Учесть, что нужно купить целое количество пакетов молока.
 */
public class homework0506 {
    public static void main(String[] args) {

        double n = 27;
        int procentToschih = 100;
        int kolichestvoToschih = (int) (n / 100 * procentToschih);
        int pirozok = 1;
        int stakanMoloka = 1;
        int molokaVStakane = 200;
        int molokaVPakete = 900;
        int paykaPirozkovDlayVseh = (int) n * pirozok;
        int paykaMolokaDlyaToschih = kolichestvoToschih * stakanMoloka;
        int paykaPirozkovDlyaToschih = kolichestvoToschih * pirozok;
        int vsegoNuznoPirozkov = paykaPirozkovDlayVseh + paykaPirozkovDlyaToschih;
        double nuznoPaketovMoloka = (double)kolichestvoToschih * molokaVStakane / molokaVPakete;
        int nuznoTselihPaketovMoloka = (int)Math.ceil(nuznoPaketovMoloka);

        System.out.println("Количество первоклассников - " + (int)n);
        System.out.println("Процент тощих среди первоклассников - " + procentToschih);
        System.out.println("Количество тощих - " + kolichestvoToschih);
        System.out.println("Пайка пирожков для всех - " + paykaPirozkovDlayVseh);
        System.out.println("Пайка пирожков для тощих - " + paykaPirozkovDlyaToschih);
        System.out.println("Пайка молока для тощих - " + paykaMolokaDlyaToschih);
        System.out.println("Всего нужно выдать - " + vsegoNuznoPirozkov +  " пирожков и " + paykaMolokaDlyaToschih + " стаканов молока.");
        System.out.println("Нужно целых пакетов молока - " + nuznoTselihPaketovMoloka);
    }
}
