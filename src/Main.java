/*VAR
altura, raio, pi, volume: Real

INICIO

Ler altura
Ler raio
Ler pi

volume <- pi * (raio * raio) * altura

Escreva "O volume do cilindro é igual a " + volume + " cm³"

FIM

TESTE DE MESA

| Altura (cm) | Raio (cm) | π   | Volume (cm³) |
|-------------|----------|------|--------------|
| 10          | 3        | 3.14 | 282.6        |
| 5           | 4        | 3.1416 | 251.328    |
| 12          | 2        | 3     | 144         |
| 8           | 5        | 3.1   | 620         |
| 15          | 7        | 3.1416 | 2309.076   |
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double altura,raio,pi,volume;

        //String
        String saltura,sraio,spi;

        //Altura
        saltura = JOptionPane.showInputDialog(null, "Qual a altura do cillindro?");
        altura = Double.parseDouble(saltura);

        ///Raio da base
        sraio = JOptionPane.showInputDialog(null, "Qual o raio da base do cilindro?");
        raio = Double.parseDouble(sraio);

        //Pi
        spi = JOptionPane.showInputDialog(null, "Qual valor de π será utilizado? (Ex: 3, 3.1, 3.14...)");
        pi = Double.parseDouble(spi);

        //Main code
        volume = pi * (raio * raio) * altura;

        //Output
        JOptionPane.showMessageDialog(null, "O volume do cilindo é igual a " + volume + "cm³");

    }
}
