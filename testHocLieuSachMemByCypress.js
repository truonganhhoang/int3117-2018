describe('Login page hoclieusachmem', function() {

    it ('Visit hoclieusachmem', function () {
        cy.visit('https://accounts.sachmem.vn/users/sign_in')
    })

     it ('Type username', function () {
        cy.get('#email')
            .type('daihv96@gmail.com').should('have.value', 'daihv96@gmail.com')
    })

     it ('Type password', function () {
        cy.get('#password')
            .type('hoangdai16020077').should('have.value', 'hoangdai16020077')
    })

     it ('Login', function () {
        cy.get('.btn-block')
            .click
    })

})