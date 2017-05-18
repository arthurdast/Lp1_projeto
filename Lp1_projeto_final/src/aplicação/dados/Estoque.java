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
import aplicação.ferramentas.exceções.ConflictException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo
 */
public class Estoque implements Serializable {

    private ArrayList<Produto> lista = new ArrayList<>();

    public void salvarDados(ArrayList<Produto> E) {
        int i, j;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("myfile.ser"));
            ArrayList<Produto> X = (ArrayList<Produto>) in.readObject();
            in.close();
            for(i=0;i<E.size();i++){
                for(j=0;j<X.size();j++){
                    if(E.get(i).getCodigo()==X.get(j).getCodigo()){
                        throw new ConflictException("O código digitado já está em uso.");
                    }
                }
            }
            X.addAll(E);
            FileOutputStream fos = new FileOutputStream("myfile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(X);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void carregarDados(ArrayList<Produto> E) {
        int i, j;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("myfile.ser"));
            ArrayList<Produto> X = (ArrayList<Produto>) in.readObject();
            in.close();
            ArrayList<Produto> Z = new ArrayList<>();
            Z.addAll(X);
            Z.addAll(E);
            for (i = 0; i < Z.size(); i++) {
                for (j = 0; j < X.size(); j++) {
                    if (!X.contains(Z.get(i))) {
                        E.add(X.get(j));
                    }
                }
            }
            E.clear();
            E.addAll(Z);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.ERROR_MESSAGE);
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

}
