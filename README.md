# CheggEasybibAppTest
This project does automated testing of various functionalities of [https://www.easybib.com/project/style/mla8?id=1586186473_5e8b48e9ce6bd6.38423782](https://www.easybib.com/project/style/mla8?id=1586186473_5e8b48e9ce6bd6.38423782)

## Tasks:
1. Verify Copy All, Export & Save buttons exist - *Please refer to :* **verifyButtonPresence()**
2. Verify  clicking on the Export button will open up the export modal - *Please refer to :* **verifyExportModal()**
3. Verify clicking on the citation menu button (the button next to the citation with 3 dots) will open Citation Actions Menu - *Please refer to :* **verifyCitationActionsMenu()**
4. Verify  clicking on the Copy Citation button in the Citation Actions Menu will open the copy success model - *Please refer to :* **verifyCopySuccessfulModal()**

### Steps to execute this project
Pre-Requisite: Java Environment
1. Clone the Project to local IDE (Eclipse preferred - due to step 2)
2. After cloning, install TestNG plugin for that IDE (go to https://testng.org/doc/download.html section titled "Eclipse Plug-In")
Note: TestNG has compatible plugin for Eclipse to execute locally. Not sure to what extent it is supported in other IDEs
3. Once TestNG is installed, open a file named "testng.xml" in the main project directory
4. In that file, right click->Run as->TestNG Suite
5. Tests will be launched and execution details will be seen in the console
6. Once the test has completed execution, head towards test-output folder (might need to refresh project if this folder is not seen at first) and open index.html to explore HTML version of test execution report.
