describe('Test Visit Page', function(){
    it('Access to website', function () {
        cy.visit('http://sample-app-tuan-anh.herokuapp.com')
    })
})

describe('Test User', function(){
    it('Login', function () {
        cy.get('a[href="/login"]').click()

        cy.get('input[id=session_email]').type("example@railstutorial.org")
        cy.get('input[id=session_password]').type("foobar")
        cy.get('input[name=commit]').click()
      })

      it('Edit Profile', function () {
        cy.get('.dropdown-toggle').click()
        cy.get('.dropdown-menu > :nth-child(2) > a').click()

        cy.get('input[id=session_email]').type("example@railstutorial.org")
        cy.get('input[id=session_password]').type("foobar")
        cy.get('input[name=commit]').click()
        
        cy.get('input[id=user_name]').clear().type('Jane Lane')
        cy.get('input[name=commit]').click()
        cy.get('.nav > :nth-child(1) > a').click()
      })

      it('Post micropost', function () {
        cy.get('textarea[id=micropost_content]').type("example@railstutorial.org")
        cy.get('input[name=commit]').click()
      })

      it('View following and followers', function () {
        cy.get('.user_info > :nth-child(3) > a').click()
        cy.get('[href="/users/1/following"]').click()

        cy.get('input[id=session_email]').type("example@railstutorial.org")
        cy.get('input[id=session_password]').type("foobar")
        cy.get('input[name=commit]').click()
        
        cy.get('[href="/users/1/followers"]').click()
      })
})
