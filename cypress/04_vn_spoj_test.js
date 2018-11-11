// @author: Nguyen Minh Chau
describe('CypressFirstTest', function() {
    it('Asserts', function() {
        cy.visit('https://vn.spoj.com/');

        cy.contains('sign in').click()

        cy.url()
            .should('include', '/login')

        cy.get('.btn-primary')
            .should('contain', 'sign in')

        cy.get('.input-sm:first')
            .type('ahihi', {force:true})
            .should('have.value', 'ahihi')
    })	
})  
