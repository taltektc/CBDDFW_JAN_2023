# CBDDFW_JAN_2023
CucumberBDD FW with TestNG and Maven

# How to run the test
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"

# How to merge code
- git checkout main
- git pull origin main
- git merge feature branch name goes here. 
  - Example: git merge QA-1
- git push origin master
