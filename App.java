/*Universidade Federal do Maranhão
  Ciência e Tecnologia
  Paradigmas de Programação
  Fernando da Silva Costa
 */

package br.com.testecrud;

import br.com.testecrud.dao.DiscenteDAO;
import br.com.testecrud.model.Discente;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        DiscenteDAO dao = new DiscenteDAO();

        //AS IMPLEMENTAÇOES SEGUEM ABAIXO COM A INSTRUÇAO DE O QUE CADA UMA ESTÁ FAZENDO
//---------------------------------------------------------------------------------------------
        /*
        //COMANDO PARA DELETAR UM DISCENTE DO BD
        dao.delete(1L);

         */



//----------------------------------------------------------------------------------------------------------------------------------
        /*
        //COMANDOS PARA ATUALIZAR UM DETERMINADO DADO DE UM DISCENTE
        //PRIMNEIRO VAMOS MOSTRAR O DADO COMO ESTA NO BD DEPOIS MOSTRAR NOVAMENTE A ALTERAÇAO QUE FOI FEITA


        Optional<Discente> discenteOptional = dao.findBymatricula(5L);

        Discente discente = discenteOptional.get();
        System.out.println("============================================");
        System.out.println("Matricula: " + discente.getMatricula());
        System.out.println("Nome: " + discente.getNome());
        System.out.println("Email: " + discente.getEmail());
        System.out.println("Curso: " + discente.getCurso());
        System.out.println("============================================");

        discente.setNome("José Raimundo");
        discente.setEmail("seuzeze@discente.ufma.br");
        discente.setCurso("Matematica");

        dao.update(discente);

        System.out.println("============================================");
        System.out.println("Matricula: " + discente.getMatricula());
        System.out.println("Nome: " + discente.getNome());
        System.out.println("Email: " + discente.getEmail());
        System.out.println("Curso: " + discente.getCurso());
        System.out.println("============================================");
        System.out.println("ALTERAÇAO REALIZADA");
         */

//----------------------------------------------------------------------------------------------------------------------------------------

        /*
        //COMANDOS PARA BUSCAR UM DISCENTE PELA MATRICULA(DEVE SER COLOCADO O NUMERO DA MATRICULA E UM L PARA IDENTIFICAR QUE É DO TIPO LONG)
        Optional<Discente> discenteOptional = dao.findBymatricula(1L);
        discenteOptional.ifPresent(discente -> {
            System.out.println("============================================");
            System.out.println("Matricula: " + discente.getMatricula());
            System.out.println("Nome: " + discente.getNome());
            System.out.println("Email: " + discente.getEmail());
            System.out.println("Curso: " + discente.getCurso());
            System.out.println("============================================");

        });*/

//--------------------------------------------------------------------------------------------------------------------------

        /*
        //COMANDOS PARA RETORNAR TODOS OS DISCENTES PRESENTES NO BD
        List<Discente> discentes = dao.findAll();

        for (Discente discente : discentes) {
            System.out.println("============================================");
            System.out.println("Matricula: " + discente.getMatricula());
            System.out.println("Nome: " + discente.getNome());
            System.out.println("Email: " + discente.getEmail());
            System.out.println("Curso: " + discente.getCurso());
            System.out.println("============================================");
        }*/


//-------------------------------------------------------------------------------------------------------------------------

        /*
        //COMANDOS PARA ADICIONAR NOVOS DISCENTES NO BD E RETONAR O NUMERO DA MATRICULA CRIADO
        Discente discente = new Discente();
        discente.setNome("Pedro");
        discente.setEmail("pedin@discente.ufma.br");
        discente.setCurso("Historia");

        Discente discenteInserido = dao.save(discente);
        System.out.println("Um discente foi inserido com a matricula : " + discenteInserido.getMatricula());
    */
//-----------------------------------------------------------------------------------------------------------------------

    }
}
