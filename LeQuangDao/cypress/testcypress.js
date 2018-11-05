describe('Test login facebook.com', () => {
  it('Visit Website', () => {
    cy.visit('https://www.facebook.com');
  });

  it('Test input Email or Phone', () => {
    cy.get('#email')
      .type('fake@email.com')
      .should('have.value', 'fake@email.com');
  });

  it('Test input Password', () => {
    cy.get('#pass')
      .type('mat khau')
      .should('have.value', 'mat khau');
  });

  it('Press Login', () => {
    cy.get('#loginbutton').click();
  });

  it('Check password has hiden', () => {
    cy.get('#pass').should('be.empty');
  });
});