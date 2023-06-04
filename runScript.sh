./mvnw clean
read -p "Ingrese Nombre de Suite:" suite
./mvnw test -DsuiteName=$suite
./mvnw allure:serve