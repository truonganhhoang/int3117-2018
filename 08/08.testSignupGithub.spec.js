describe('Sign up Github', () => {
    it('visit github and click sign up', () => {
        cy.visit('https://github.com')
        cy.contains('Sign up for GitHub').click()
        cy.url().should('include', '/join')
    })
    //should be fail
    it('create account', () => {
        cy.get('#signup_button').click()
    })
})
