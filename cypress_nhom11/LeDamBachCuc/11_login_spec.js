describe('Login Page', function() {
    it ('Visit hoclieu', function () {
        cy.visit('https://accounts.sachmem.vn/users/sign_in')
    })

    it ('Type username', function () {
        cy.get('#user_email')
            .type('leedan1097@gmail.com').should('have.value', 'leedan1097@gmail.com')
    })

    it ('Type password', function () {
        cy.get('#user_password')
            .type('12345678').should('have.value', '12345678')
    })

    it ('Remember user', function () {
        cy.get('#user_remember_me').not('[disabled]')
            .check().should('be.checked')
    })

    it ('Submit', function () {
        cy.get('.btn-block')
            .click
    })

    it ('Login with Google', function () {
        cy.get('.btn-google')
            .click
    })
})

