read -p "Ingrese Nombre de Suite:" suite
./mvnw clean test -DsuiteName=$suite allure:serve