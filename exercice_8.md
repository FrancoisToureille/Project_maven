### Exercice 8
J'ai pu créer les tests de deposit et withdraw et lesexécuter avec succès

```
francois@franztoureille:/mnt/c/Users/toure/Downloads/BankApplication/Project_maven/bank-application$ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /mnt/c/Users/toure/Downloads/BankApplication/Project_maven/bank-application/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /mnt/c/Users/toure/Downloads/BankApplication/Project_maven/bank-application/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ bank-application ---
[INFO] Surefire report directory: /mnt/c/Users/toure/Downloads/BankApplication/Project_maven/bank-application/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.imt.mines.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.066 sec
Running com.imt.mines.BankAccountTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.650 s
[INFO] Finished at: 2026-01-16T09:46:26+01:00
`
[INFO] ------------------------------------------------------------------------
