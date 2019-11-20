
/**
 * Esta classe tem como objetivo treinar os ifs e elses através de um jogo
 * simples o cara a cara, no qual, neste caso, o computador tentara
 * adivinhar qual foi a pessoa que o usuario escolheu.
 * 
 * A primeira versao desse jogo foi desenvolvida por Priscila Zeferino, como
 * um dos trabalhos realizados na disciplina de Programação I,
 * da turma 101Info, no ano de 2016, utilizando como personagens os alunos.
 * 
 * Essa segunda versao utiliza personagens da serie The big bang theory. E foi desenvolvido apenas como mecanismo de aprendizagem, 
 * em hipotese alguma, os personagens serao utilizados na aplicacao com intuito comercial. 
 * 
 * @author Priscila Zeferino
 * @version 2.0
 */
public class Cara_a_Cara
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        // Sheldon - cabelos castanhos, olhos azuis, fisico teorico, dois Phds.e abelhas.
        // Leonard Hoffstader - cabelos castanhos, oculos, olhos castanhos, cabelos cacheado, filho de uma psiquiatra 
        // Penny  - loira, olhos castanhos, mulher, garconete, queria ser atriz.
        // Rajesh Koothrappali - indiano, olhos castanhos, cabelos preto, astrofisico
        // Howard Wolowitz - engenheiro aeroespacial, cabelo castanho, liso, olhos verdes
        // Bernadete - loira, usa oculos, microbiologia, garconete, olhos verdes
        // Amy - Cabelos lisos, cabelos castanhos, usa oculos, neurocientista, olhos verdes

        System.out.println("Para jogar digite: 1 para SIM ou 2 para NÃO ");       
        System.out.println("Essa personagem usa oculos ?");
        int answer = entrada.nextInt();

        if(answer == 1)
        {
            System.out.println("Esse personagem eh um homem?");
            answer = entrada.nextInt();
            if(answer == 1)
            {
                System.out.println("Esse personagem eh Leonard?");
                answer = entrada.nextInt();
                if(answer == 1)
                {
                    System.out.println("Acertei. Obrigada por jogar...");
                }
                else if(answer == 2)
                {
                    System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                }
                else
                {
                    System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                }
            }
            else if(answer == 2)
            {
                System.out.println("Entao eh uma mulher... ela tem cabelos castanhos?");
                answer = entrada.nextInt();
                if(answer == 1)
                {
                    System.out.println("Essa persongaem eh a Amy? ");
                    answer = entrada.nextInt();
                    if(answer == 1)
                    {
                        System.out.println("Acertei. Obrigada por jogar...");
                    }
                    else if(answer == 2)
                    {
                        System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                    }
                    else
                    {
                        System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                    }
                }
                else if(answer == 2)
                {
                    System.out.println("Essa personagem eh a Bernadette?");
                    answer = entrada.nextInt();
                    if(answer == 1)
                    {
                        System.out.println("Acertei. Obrigada por jogar...");
                    }
                    else if(answer == 2)
                    {
                        System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                    }
                    else
                    {
                        System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");  
                    }
                }
                else
                {
                    System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                }
            }
        }
        else if(answer == 2)
        {
            System.out.println("Esse personagem eh uma mulher?");
            answer = entrada.nextInt();
            if(answer == 1)
            {
                System.out.println("Essa personagem eh a Penny?");
                answer = entrada.nextInt();
                if(answer == 1)
                {
                    System.out.println("Acertei. Obrigada por jogar...");
                }
                else if(answer == 2)
                {
                    System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                }
                else
                {
                    System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                }
            }
            else if(answer == 2)
            {
                System.out.println("Esse personagem eh indiano?");
                answer = entrada.nextInt(); 
                if(answer == 1)
                {
                    System.out.println("Esse personagem eh Rajesh?");
                    answer = entrada.nextInt();
                    if(answer == 1)
                    {
                        System.out.println("Acertei. Obrigada por jogar...");
                    }
                    else if(answer == 2)
                    {
                        System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                    }
                    else
                    {
                        System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                    }
                }
                else if(answer == 2)
                {
                    System.out.println("Esse personagem tem olhos azuis?");
                    answer = entrada.nextInt();
                    if(answer == 1)
                    {
                        System.out.println("Esse personagem eh Sheldon?");
                        answer = entrada.nextInt();
                        if(answer == 1)
                        {
                            System.out.println("Acertei. Obrigada por jogar...");
                        }
                        else if(answer == 2)
                        {
                            System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                        }
                        else
                        {
                            System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                        }
                    }
                    else if(answer == 2)
                    {
                        System.out.println("Esse personagem eh Howard?");
                        answer = entrada.nextInt();
                        if(answer == 1)
                        {
                            System.out.println("Acertei. Obrigada por jogar...");
                        }
                        else if(answer == 2)
                        {
                            System.out.println("Se tah me zoando, eu sei q acertei hahahah");
                        }
                        else
                        {
                            System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                        }
                    }
                    else
                    {
                        System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                    }
                }
                else
                {
                    System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
                }
            }
            else
            {
                System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
            }
        }
        else
        {
            System.out.println("voce digitou um valor invalido. Por favor, reinicie o jogo");
        } 
    }
}