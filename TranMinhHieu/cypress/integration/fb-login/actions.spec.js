describe('Facebook Login', function () {
    it("login", function () {
        cy.visit('https://www.facebook.com/')
        cy.get('#email')
            .type('thisismyfacebookid').should('have.value', 'thisismyfacebookid')
        cy.get('#pass')
            .type('thisismypassword').should('have.value', 'thisismypassword')
        cy.get('#loginbutton').click({force: true})
    })
})
