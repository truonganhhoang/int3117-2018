describe('Test login failed sachmem.vn', () => {
  it('visit website', () => {
    cy.visit('https://accounts.sachmem.vn/users/sign_in');
  });
  it('Test visible Đăng nhập page', () => {
    cy.contains('Đăng nhập').should('be.visible');
  });
   it('Test enter email', () => {
    cy.get('#user_email')
      .type('luongquy.vnu@gmail.com');
  });
   it('Test enter password', () => {
    cy.get('#user_password')
      .type('1');
  });
   it('Test click login button', () => {
    cy.get('input.btn-block').click();
  });
  it('Test visible error', () => {
	  //cy.contains('Email hoặc mật khẩu không chính xác. Vui lòng nhập đúng địa chỉ email và mật khẩu của bạn.').should('be.visible');
	  cy.contains('.margin-right-10px').should('be.visible');
  });
});
