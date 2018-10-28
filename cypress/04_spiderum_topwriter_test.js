// @author: Nguyen Trung Nghia
beforeEach(() => {
    cy.visit('https://spiderum.com/top-writer');
})
describe('Cypress Demo', function() {
    it('Check avatar availabled', function() {
        cy.get(".user-list > li img")
          .should('have.attr', 'src');
    })
    it('Check alt availabled', function() {
        cy.get(".user-list > li img")
          .should('have.attr', 'alt');
    })
    it('Check user\'s address availabled', function() {
        cy.get(".user-list > li a")
          .should('have.attr', 'href');
    })
})