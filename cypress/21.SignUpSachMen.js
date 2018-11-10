describe('Test Đăng ký tài khoản sách mền', () => {
    it('visit website', () => {
      cy.visit('https://accounts.sachmem.vn/users/sign_up');
    });
  
    it('Nhập họ', () => {
        cy.get('#user_last_name').type('Bui').blur().should('have.value', 'Bui');
    });

    it('Nhập họ với kí tự đặc biệt', () => {
        cy.get('#user_last_name').type('1').blur().should('have.value', 'Bui1');
        cy.get('#user_last_name-error').should('contain', 'Họ không được chứa ký tự đặc biệt!');
    });

    it('Để  họ rỗng', () => {
        cy.get('#user_last_name').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_last_name-error').should('contain', 'Bạn chưa nhập họ!');
    });

    it('Nhập tên', () => {
        cy.get('#user_first_name').type('Minh').blur().should('have.value', 'Minh');
    });

    it('Nhập tên với kí tự đặc biệt', () => {
        cy.get('#user_first_name').type('1').blur().should('have.value', 'Minh1');
        cy.get('#user_first_name-error').should('contain', 'Tên không được chứa ký tự đặc biệt!');
    });

    it('Để  tên rỗng', () => {
        cy.get('#user_first_name').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_first_name-error').should('contain', 'Bạn chưa nhập tên!');
    });

    it('Nhập email', () => {
        cy.get('#user_email').type('minhkjl3@gmail.com').blur().should('have.value', 'minhkjl3@gmail.com');
    });

    it('Nhập email không hợp lệ', () => {
        cy.get('#user_email').type('{selectall}{backspace}minhkjl3').blur().should('have.value', 'minhkjl3');
        cy.get('#user_email-error').should('contain', 'Vui lòng nhập email hợp lệ!');
    });

    it('Nhập tên miền email khả nghi', () => {
        cy.get('#user_email').type('{selectall}{backspace}minhkjl3@yahoo.com').blur().should('have.value', 'minhkjl3@yahoo.com');
        cy.get('#user_email-error').children('span').should('have.class', 'text-warning')
                                            .and('contain', 'Phần đuôi của email');
    });

    it('Để  email rỗng', () => {
        cy.get('#user_email').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_email-error').should('contain', 'Bạn chưa nhập email!');
    });

    it('Nhập xác nhận email', () => {
        cy.get('#user_email').type('minhkjl3@gmail.com').blur().should('have.value', 'minhkjl3@gmail.com');
        cy.get('#user_email_confirmation').type('minhkjl3@gmail.com').blur().should('have.value', 'minhkjl3@gmail.com');
    });

    it('Nhập xác nhận email không khớp', () => {
        cy.get('#user_email_confirmation').type('{selectall}{backspace}minhkjl4@gmail.com').blur().should('have.value', 'minhkjl4@gmail.com');
        cy.get('#user_email_confirmation-error').should('contain', 'Hai địa chỉ email không trùng nhau!');
    });

    it('Để  xác nhận email rỗng', () => {
        cy.get('#user_email_confirmation').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_email_confirmation-error').should('contain', 'Bạn chưa nhập email!');
    });

    it('Nhập password', () => {
        cy.get('#user_password').type('12345678').blur().should('have.value', '12345678');
    });

    it('Nhập password không đủ 8 ký tự', () => {
        cy.get('#user_password').type('{selectall}{backspace}123').should('have.value', '123');
        cy.get('#user_password-error').should('contain', 'Vui lòng nhập tối thiểu 8 ký tự!');
    });

    it('Để  password rỗng', () => {
        cy.get('#user_password').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_password-error').should('contain', 'Bạn chưa nhập mật khẩu!');
    });

    it('Nhập xác nhận password', () => {
        cy.get('#user_password').type('12345678').blur().should('have.value', '12345678');
        cy.get('#user_password_confirmation').type('12345678').blur().should('have.value', '12345678');
    });

    it('Nhập xác nhận password không đủ 8 ký tự', () => {
        cy.get('#user_password_confirmation').type('{selectall}{backspace}123').should('have.value', '123');
        cy.get('#user_password_confirmation-error').should('contain', 'Vui lòng nhập tối thiểu 8 ký tự!');
    });

    it('Nhập xác nhận password không khớp', () => {
        cy.get('#user_password_confirmation').type('{selectall}{backspace}12345679').should('have.value', '12345679');
        cy.get('#user_password_confirmation-error').should('contain', 'Hai mật khẩu không trùng nhau!');
    });

    it('Để  xác nhận password rỗng', () => {
        cy.get('#user_password_confirmation').type('{selectall}{backspace}').should('have.value', '');
        cy.get('#user_password_confirmation-error').should('contain', 'Bạn chưa nhập lại mật khẩu!');
    });

});