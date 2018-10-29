describe('Twitter Login', function () {
    it("login", function () {
        cy.visit('https://twitter.com')
        cy.contains('Log in').click({force:true});
        cy.get('.js-username-field').type('test123').should('have.value', 'test123')
        cy.get('.js-password-field').type('abcabc').should('have.value', 'abcabc')
        cy.contains('Log in').click({force: true});
        cy.url().should(($a) => {
            expect('$a').to.not.equal('https://twitter.com')
        })
    })
})