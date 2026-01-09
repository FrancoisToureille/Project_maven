## Exercice 7 François TOUREILLE

### mvn clean
La commande mvn clean se limite à l’exécution de la phase clean.
Cette phase a pour objectif de supprimer les fichiers générés lors d’un build précédent, notamment en effaçant le répertoire target/.

### mvn test
La commande mvn test exécute successivement les phases clean, validate, compile et test.
La phase test permet d’exécuter des tests sur le code source compilé à l’aide d’un framework de test, qui est JUnit dans notre cas.
Cette commande génère également le répertoire target/, lequel contient notamment les dossiers classes, generated-sources, generated-test-sources, maven-status et test-classes, regroupant les classes compilées ainsi que les tests compilés.

### mvn package
La commande mvn package exécute les phases clean, validate, compile, test et package.
La phase package permet de produire l’artefact final de l’application : elle génère le répertoire target/maven-archiver ainsi que le fichier JAR de l’application dans le répertoire target/.

### mvn verify
La commande mvn verify exécute les phases validate, compile, test, package et verify.
La phase verify permet d’effectuer des contrôles sur les résultats des tests d’intégration afin de s’assurer du respect des critères de qualité.
Contrairement à la phase test, qui se limite aux tests unitaires, et à la phase package, qui s’arrête à la création de l’artefact sans exécuter les tests d’intégration, verify valide l’ensemble du processus de test.
