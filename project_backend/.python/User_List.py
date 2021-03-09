class userList:
    accountFile = "accountsList.txt"

    def __init__(self, account):
        self.account = account

    # imports a new/updated account into the accountsList.txt file
    def import():
        fileObject = open(accountFile, "a")
        fileObject.write(accountFile, "")
        fileObject.write('\n')
        fileObject.close()

    # displays list for admin purposes only
    def displayUserList():
        # goes through each line and displays accountslist
        pass

    # searches for a user in the list
    # returns boolean based on if user exists in list or not
    def searchUser(email):
        pass

    def login():
        # goes in and searches for an account based on username
        # checks the password associated with the account and one given match
        pass
