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
public class Carros extends Automovel implements InterfaceAuto {

    public Carros(int tanque, int pneus, int combustivel) {
        this.tanque = tanque;
        this.pneus = pneus;
        this.combustivel = combustivel;
        this.nivelCombustivel = 25;
        this.status = true;
        this.Oleo = 0;
    }

    public Carros() {
    }
     @Override
 public void Ligar() {
        if (this.status == false) {
            if (this.nivelCombustivel > 0) {
                if (Oleo < 35) {
                    System.out.println("O Carro ligou");
                    this.status = true;
                } else {
                    System.out.println("O Carro não pode ligar, precisa trocar Oleo");
                }
            } else {
                System.out.println("O Carro nao possui combustivel");
            }
        } else {
            System.out.println("O Carro ja esta ligado");
        }

    }

@Override
        public void Abastecer() {
        Scanner ler = new Scanner(System.in);
            int litroscom = 0;
            if (status == false && nivelCombustivel + litroscom <= 50) {
                System.out.println("Quatos litros deseja abasrtece?");
                litroscom = ler.nextInt();
                if (litroscom > 0 && nivelCombustivel + litroscom <= 50) {
                    System.out.println("O Carro abasteceu " + litroscom + " litros");
                    nivelCombustivel = nivelCombustivel + litroscom;

                } else {
                    System.out.println("O Carro não pode ser abatecida");
                }
            } else {
                System.out.println("O Carro nao pode ser abastecida");

            }

        }

        @Override
        public void Acelerar() {
        if (nivelCombustivel <= 4) {
                System.out.println("Combustivel esta acabando, va para o posto mais proximo");
            }
            if (this.status == true && this.nivelCombustivel > 0) {
                System.out.println("O Carro acelerou");
                nivelCombustivel = nivelCombustivel - 2;
                Oleo = Oleo + 2;

            } else if (this.status == false && this.nivelCombustivel > 0) {
                System.out.println("O Carro esta desligado");

            } else if (this.status == true && this.nivelCombustivel == 0) {
                System.out.println("O Carro desligou por falta de combustivel!\n" + "Nivel do Combutive = " + this.nivelCombustivel);
                this.status = false;

            } else {
                System.out.println("O Carro esta sem combustivel");

            }
            if (Oleo >= 35) {
                System.out.println("Trocar Oleo mais rapido possivel");
            } if (Oleo > 40) {
                this.status = false;
                System.out.println("O Carro Desligou");
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
                    if (contador <= 4) {
                        System.out.println("Quantidade de pneus trocado:" + contador);
                    } else {
                        System.out.println("Quantidade de pneus escolhidos acima do limite, são no maximo 4");

                    }
                } else {
                    System.out.println("Não ha pneus furados!");

                }
            } else {
                System.out.println("O Carro esta ligado!");

            }

        }

    @Override
    public void TrocarOleo() {
       if(this.status == false ){
        if(Oleo >= 35 ){
           setOleo(0);
           System.out.println("Oleo trocado com sucesso");
       }
       else{
           System.out.println("Nivel de oleo ok " + getOleo());
       }
       }else{
           System.out.println("O Carro não esta desligada");
                }
    }
        
 }
