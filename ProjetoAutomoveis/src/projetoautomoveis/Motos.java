/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoautomoveis;

import java.util.Scanner;

/**
 *
 * @author mgn-1
 */
public class Motos extends Automovel implements InterfaceAuto {

    public Motos(int tanque, int pneus, int combustivel) {
        this.tanque = tanque;
        this.pneus = pneus;
        this.combustivel = combustivel;
        this.nivelCombustivel = 10;
        this.status = true;
        this.Oleo = 0;
    }

    public Motos() {
    }

    public void Ligar() {
        if (this.status == false) {
            if (this.nivelCombustivel > 0) {
                if (Oleo < 30) {
                    System.out.println("A moto ligou");
                    this.status = true;
                } else {
                    System.out.println("A moto não pode ligar, precisa trocar Oleo");
                }
            } else {
                System.out.println("A moto nao possui combustivel");
            }
        } else {
            System.out.println("A moto ja esta ligado");
        }

    }

@Override
        public void Abastecer() {
        Scanner ler = new Scanner(System.in);
            int litroscom = 0;
            if (status == false && nivelCombustivel + litroscom <= 15) {
                System.out.println("Quatos litros deseja abasrtece?");
                litroscom = ler.nextInt();
                if (litroscom > 0 && nivelCombustivel + litroscom <= 15) {
                    System.out.println("Moto abasteceu " + litroscom + " litros");
                    nivelCombustivel = nivelCombustivel + litroscom;

                } else {
                    System.out.println("Moto não pode ser abatecida");
                }
            } else {
                System.out.println("Moto nao pode ser abastecida");

            }

        }

        @Override
        public void Acelerar() {
        if (nivelCombustivel <= 3) {
                System.out.println("Combustivel esta acabando, va para o posto mais proximo");
            }
            if (this.status == true && this.nivelCombustivel > 0) {
                System.out.println("O veiculo acelerou");
                nivelCombustivel = nivelCombustivel - 1;
                Oleo = Oleo + 1;

            } else if (this.status == false && this.nivelCombustivel > 0) {
                System.out.println("O veiculo esta desligado");

            } else if (this.status == true && this.nivelCombustivel == 0) {
                System.out.println("A moto desligou por falta de combustivel!\n" + "Nivel do Combutive = " + this.nivelCombustivel);
                this.status = false;

            } else {
                System.out.println("O veiculo esta sem combustivel");

            }
            if (Oleo >= 25) {
                System.out.println("Trocar Oleo mais rapido possivel");
            } if (Oleo > 30) {
                this.status = false;
                System.out.println("Moto Desligou");
                System.out.println("Trocar Oleo imediatamente");
            }

        }

        @Override
        public void Pneus() {
        Scanner ler = new Scanner(System.in);
            int contador = 0;
            if (this.status == false) {
                System.out.println("Quantos pneus gostaria de trocar ?");
                contador = ler.nextInt();
                if (contador > 0) {
                    if (contador <= 2) {
                        System.out.println("Quantidade de pneus trocado:" + contador);
                    } else {
                        System.out.println("Quantidade de pneus escolhidos acima do limite, são no maximo 2");

                    }
                } else {
                    System.out.println("Não ha pneus furados!");

                }
            } else {
                System.out.println("Carro esta ligado!");

            }

        }

    @Override
    public void TrocarOleo() {
       if(this.status == false ){
        if(Oleo >= 25 ){
           setOleo(0);
           System.out.println("Oleo trocado com sucesso");
       }
       else{
           System.out.println("Nivel de oleo ok " + getOleo());
       }
       }else{
           System.out.println("A moto não esta desligada");
                }
    }
        

 }
