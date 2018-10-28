describe('TestLogin', function(){
    beforeEach(function(){
        cy.visit('https://uetmail.vnu.edu.vn')
    })

    it('error_login', function(){

        cy.get('input[name="login_username"]')
        .type('15021059')

        cy.get('input[name="secretkey"]')
        .type('242924')
        
        cy.contains('Đăng nhập').click()

    })
   

    it('access_login',function(){
        
        cy.get('input[name="login_username"]')
        .type('15021059')

        cy.get('input[name="secretkey"]')
        .type('242924duc{enter}')

    })
})