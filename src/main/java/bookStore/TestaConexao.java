package bookStore;

import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class TestaConexao {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3307/livraria"; // porta mapeada no docker
            String user = "user"; // ou "user" se criou no docker-compose
            String password = "user123"; // mesma senha do docker-compose

            try (Connection conexao = DriverManager.getConnection(url, user, password)) {
                System.out.println("✅ Conexão estabelecida com sucesso!");
            } catch (SQLException e) {
                System.out.println("❌ Erro ao conectar: " + e.getMessage());
        }
    }
}
