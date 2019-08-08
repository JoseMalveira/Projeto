/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoautomoveis;

/**
 *
 * @author mgn-1
 */
public abstract class Automovel {

    protected int tanque;
    protected boolean status;
    protected int combustivel;
    protected int pneus;
    protected int nivelCombustivel;
    protected float acelerar;
    protected int Abastecer;
    protected int Oleo;
    protected int TrocarOleo;

   public void Desligar() {
        if (this.status == true) {
            System.out.println("O veiculo desligou");
            this.status = false;
        } 
        else{
            System.out.println("O veiculo ja esta desligado");
        }
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public float getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(float acelerar) {
        this.acelerar = acelerar;
    }

    public int getAbastecer() {
        return Abastecer;
    }

    public void setAbastecer(int Abastecer) {
        this.Abastecer = Abastecer;
    }

    public int getOleo() {
        return Oleo;
    }

    public void setOleo(int Oleo) {
        this.Oleo = Oleo;
    }

    public int getTrocarOleo() {
        return TrocarOleo;
    }

    public void setTrocarOleo(int TrocarOleo) {
        this.TrocarOleo = TrocarOleo;
    }

}


