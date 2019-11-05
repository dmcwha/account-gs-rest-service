# account-gs-rest-service
Small example backend service app for bank account REST API

Supported API is:

http://localhost:8080/accounts - for list of bank accounts

http://localhost:8080/transactions - for list of all transactions

http://localhost:8080/transactions?accountnumber={accountnumber} - for list of transactions filtered by account number

All data is hardcoded in the MockedData files. Ideally this would be sourced from a database.

The application has only been built in IntelliJ IDEA, other build methods may require some work.
