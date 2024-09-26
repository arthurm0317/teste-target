package application;

public class PercentualEstados {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        System.out.printf("Faturamento mensal e percentual de representação por estado:%n");
        System.out.printf("SP: R$%.2f (%.2f%%)%n", sp, (sp / totalFaturamento) * 100);
        System.out.printf("RJ: R$%.2f (%.2f%%)%n", rj, (rj / totalFaturamento) * 100);
        System.out.printf("MG: R$%.2f (%.2f%%)%n", mg, (mg / totalFaturamento) * 100);
        System.out.printf("ES: R$%.2f (%.2f%%)%n", es, (es / totalFaturamento) * 100);
        System.out.printf("Outros: R$%.2f (%.2f%%)%n", outros, (outros / totalFaturamento) * 100);
    }
}
