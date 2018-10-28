describe('Test login sachmem.vn', () => {
  it('visit website', () => {
    cy.visit('https://accounts.sachmem.vn/users/sign_in');
  });

  it('test input username', () => {
    cy.get('#user_email')
      .type('fake@email.com')
      .should('have.value', 'fake@email.com');
  });

  it('test input password', () => {
    cy.get('#user_password')
      .type('mat khau')
      .should('have.value', 'mat khau');
  });

  it('press login', () => {
    cy.get('.btn-block[type=submit]').click();
  });

  it('check password has hiden', () => {
    cy.get('#user_password').should('be.empty');
  });
});
