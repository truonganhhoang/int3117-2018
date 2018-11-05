describe('Test tham gia lop hoc', () => {
	it('Visit website', () => {
      cy.visit('https://github.com/doanvietbach');
	  cy.contains('doanvietbach');
    });
	
	it('Test click sign up', () => {
        cy.get('.btn-primary').contains('Sign up').click()
    });
	
	it('Test Create an account button disabled', () => {
        cy.get('.btn-primary').contains('Create an account').should('be.disabled');
    });
});