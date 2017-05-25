/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo
 */
public class Estoque implements Serializable {

    private ArrayList<Produto> lista;

    public Estoque() {
        lista = new ArrayList<>();
        carregarDados();
    }

    public void salvarDados() {
        
        try {
            FileOutputStream out = new FileOutputStream("Dados.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(lista);
            objOut.flush();
            objOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carregarDados() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Dados.ser"));
            this.lista = (ArrayList<Produto>) in.readObject();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo de dados não encontrado, arquivo limpo foi criado ", "Erro 1 ", JOptionPane.ERROR_MESSAGE);
            salvarDados();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro 1 ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addProduto(Produto p) {
        lista.add(p);
    }

    public Produto getProduto(int x) {
        return lista.get(x);
    }

    public void removeProduto(Produto p) {
        lista.remove(p);
    }

    public int getQuantidade() {
        return lista.size();
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    public boolean exiteNaLista(int cod) {

        for (Produto produto : lista) {
            if (produto.getCodigo() == cod) {
                return true;
            }
        }
        return false;
    }
    
    
}
