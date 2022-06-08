//classe onde sera realizado as operacoes dentro do BD
package br.com.testecrud.dao;

import br.com.testecrud.infra.ConnectionFactory;
import br.com.testecrud.model.Discente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DiscenteDAO implements IDiscenteDAO{
    @Override
    public Discente save(Discente discente) {

        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO discente (nome, email, curso) VALUES(?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,discente.getNome());
            preparedStatement.setString(2,discente.getEmail());
            preparedStatement.setString(3,discente.getCurso());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long matricula = resultSet.getLong(1);
            discente.setMatricula(matricula);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return discente;
    }

    @Override
    public Discente update(Discente discente) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "UPDATE discente SET nome = ?, email = ?, curso = ? WHERE matricula = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,discente.getNome());
            preparedStatement.setString(2,discente.getEmail());
            preparedStatement.setString(3,discente.getCurso());
            preparedStatement.setLong(4,discente.getMatricula());

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return discente;
    }

    @Override
    public void delete(Long matricula) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM discente WHERE matricula= ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,matricula);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Discente> findAll() {
        String sql = "SELECT matricula, nome, email, curso FROM discente";
        List<Discente> discentes = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Long matricula = rs.getLong(1);
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");

                Discente discente = new Discente(matricula,nome,email,curso);
                discentes.add(discente);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return discentes;
    }

    @Override
    public Optional<Discente> findBymatricula(Long matricula) {
        String sql = "SELECT matricula, nome, email, curso FROM discente WHERE matricula = ?";

        Discente discente = null;
        try(Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,matricula);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Long PK = rs.getLong(1);
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");

                discente = new Discente(PK,nome,email,curso);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(discente);

    }
}
