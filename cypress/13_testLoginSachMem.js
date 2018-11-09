// @author: Neo

describe('Test sach mem', function() {
    it('Test Đăng nhập button', function() {

        cy.visit('https://hoclieu.sachmem.vn/folder/0')
        cy.get('Đăng nhập').click()
        
        cy.url().should('eq', 'https://accounts.sachmem.vn/users/sign_in')
    })
})