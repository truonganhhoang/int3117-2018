describe('Login Page', function() {
    it ('Visit hoclieu', function () {
        cy.visit('https://accounts.sachmem.vn/users/sign_in')
    })
     it ('Type username', function () {
        cy.get('#user_email')
            .type('lovelesser77@gmail.com').should('have.value', 'lovelesser7700@gmail.com')
    })
     it ('Type password', function () {
        cy.get('#user_password')
            .type('trongtran123').should('have.value', 'trongtran123')
    })
     it ('Submit', function () {
        cy.get('.btn-block')
            .click
    })
     it ('Login with Facebook', function () {
        cy.get('.btn-google')
            .click
    })
})