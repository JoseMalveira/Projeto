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
public class Caminhao extends Automovel implements InterfaceAuto {

    public Caminhao(int tanque, int pneus, int combustivel) {
        this.tanque = tanque;
        this.pneus = pneus;
        this.combustivel = combustivel;
        this.nivelCombustivel = 100;
        this.status = true;
        this.Oleo = 0;
    }

    public Caminhao() {
    }

    @Override
 public void Ligar() {
        if (this.status == false) {
            if (this.nivelCombustivel > 0) {
                if (Oleo < 60) {
                    System.out.println("O Caminhao ligou");
                    this.status = true;
                } else {
                    System.out.println("O caminhao não pode ligar, precisa trocar Oleo");
                }
            } else {
                System.out.println("O caminhao nao possui combustivel");
            }
        } else {
            System.out.println("O caminhao ja esta ligado");
        }

    }

@Override
        public void Abastecer() {
        Scanner ler = new Scanner(System.in);
            int litroscom = 0;
            if (status == false && nivelCombustivel + litroscom <= 100) {
                System.out.println("Quatos litros deseja abasrtece?");
                litroscom = ler.nextInt();
                if (litroscom > 0 && nivelCombustivel + litroscom <= 100) {
                    System.out.println("O caminhao abasteceu " + litroscom + " litros");
                    nivelCombustivel = nivelCombustivel + litroscom;

                } else {
                    System.out.println("O caminhao não pode ser abatecida");
                }
            } else {
                System.out.println("O caminhao nao pode ser abastecida");

            }

        }

        @Override
        public void Acelerar() {
        if (nivelCombustivel <= 5) {
                System.out.println("Combustivel esta acabando, va para o posto mais proximo");
            }
            if (this.status == true && this.nivelCombustivel > 0) {
                System.out.println("O caminhao acelerou");
                nivelCombustivel = nivelCombustivel - 3;
                Oleo = Oleo + 3;

            } else if (this.status == false && this.nivelCombustivel > 0) {
                System.out.println("O caminhao esta desligado");

            } else if (this.status == true && this.nivelCombustivel == 0) {
                System.out.println("O caminhao desligou por falta de combustivel!\n" + "Nivel do Combutive = " + this.nivelCombustivel);
                this.status = false;

            } else {
                System.out.println("O caminhao esta sem combustivel");

            }
            if (Oleo >= 55) {
                System.out.println("Trocar Oleo mais rapido possivel");
            } if (Oleo > 60) {
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
                    if (contador <= 10) {
                        System.out.println("Quantidade de pneus trocado:" + contador);
                    } else {
                        System.out.println("Quantidade de pneus escolhidos acima do limite, são no maximo 10");

                    }
                } else {
                    System.out.println("Não ha pneus furados!");

                }
            } else {
                System.out.println("O caminhao esta ligado!");

            }

        }

    @Override
    public void TrocarOleo() {
       if(this.status == false ){
        if(Oleo >= 55 ){
           setOleo(0);
           System.out.println("Oleo trocado com sucesso");
       }
       else{
           System.out.println("Nivel de oleo ok " + getOleo());
       }
       }else{
           System.out.println("O caminhao não esta desligada");
                }
    }
        
 }
